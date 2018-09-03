package com.example.cse3310.personaltutoringservice;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class makepayment extends AppCompatActivity {
    PayPalConfiguration m_configuration;
    String m_paypalClientId = "AUiMR5OyE2K8lB4U1L5Cg_f1LxtRhH3SfxENsCMQNQDJYhQHbGuP1Cuii4hLEMZNfKHiVNutshzOl9kJ";
    Intent m_service;
    int m_paypalRequestCode = 999; // or any number
    TextView m_response;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);

        m_response = (TextView) findViewById(R.id.response); // add it to xml file
        m_configuration = new PayPalConfiguration()
                .environment(PayPalConfiguration.ENVIRONMENT_SANDBOX)//sandbox for test , production for real
                .clientId(m_paypalClientId);

        m_service = new Intent(this, PayPalService.class);
        m_service.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, m_configuration);// configuration above
        startService(m_service); //paypal service , listening to calls to paypal app
    }


    void pay(View view) {
        PayPalPayment payment = new PayPalPayment(new BigDecimal(100), "USD", "Make a payment with Paypal",
                PayPalPayment.PAYMENT_INTENT_SALE); //fix error
        Intent intent = new Intent(this, PaymentActivity.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, m_configuration);
        intent.putExtra(PaymentActivity.EXTRA_PAYMENT, payment);
        startActivityForResult(intent, m_paypalRequestCode);

    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == m_paypalRequestCode) {
            if (resultCode == Activity.RESULT_OK) {   // confirmation that payment worked to avoid fraud
                PaymentConfirmation confirmation = data.getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);

                if (confirmation != null) {
                    String state = confirmation.getProofOfPayment().getState();

                    if (state.equals("approved")) //payment worked
                    {
                        m_response.setText("payment approved");

                    } else {
                        m_response.setText("error in the payment");
                    }
                } else {
                    m_response.setText("Confirmation is null");
                }
            }
        }
    }
}

