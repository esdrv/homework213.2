package com.msaggik.homework213;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.msaggik.homework213.BusTicket;
import com.msaggik.homework213.BusTicketChild;
import com.msaggik.homework213.BusTicketPensioner;

public class MainActivity extends AppCompatActivity {

    BusTicket busTicket = new BusTicket(70,5, 30);
    BusTicket busTicketPensioner = new BusTicketPensioner(70, 5, 30);
    BusTicket busTicketChild = new BusTicketChild(70, 11, 50);

    private TextView busTicketOut;
    private TextView busTicketPensionerOut;
    private TextView busTicketChildOut;
    private TextView busTicketTotalOut;

    // вывод на экран полученных значений
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        busTicketOut = findViewById(R.id.busTicketOut);
        busTicketPensionerOut = findViewById(R.id.busTicketPensionerOut);
        busTicketChildOut = findViewById(R.id.busTicketChildOut);
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut);

        busTicketOut.setText(Float.toString(busTicket.ticketPriceAll()) + " монет");
        busTicketPensionerOut.setText(Float.toString(busTicketPensioner.ticketPriceAll()) + " монет");
        busTicketChildOut.setText(Float.toString(busTicketChild.ticketPriceAll()) + " монет");
        busTicketTotalOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketPensioner.ticketPriceAll() + busTicketChild.ticketPriceAll()) + " монет");
    }
}