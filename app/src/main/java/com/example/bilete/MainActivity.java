package com.example.bilete;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import model.forChildren;
import model.forPencioners;
import model.railwayTicket;

public class MainActivity extends AppCompatActivity {
    railwayTicket railwayTicket = new railwayTicket(70, 9);
    railwayTicket forChildren = new forChildren(70, 11,  50);
    railwayTicket forPencioners = new forPencioners(70, 5, 30);
    private TextView railwayTicketOut;
    private TextView forChildrenOut;
    private TextView forPencionersOut;
    private TextView railwayTotalOut;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        railwayTicketOut = findViewById((R.id.railwayTicketOut));
        forChildrenOut = findViewById(R.id.forChildren);
        forPencionersOut = findViewById(R.id.forPencioners);
        railwayTotalOut = findViewById(R.id.railwayTotalOut);
        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + "монет");
        forChildrenOut.setText(Float.toString(forChildren.ticketPriceAll()) + "монет");
        forPencionersOut.setText(Float.toString(forChildren.ticketPriceAll()) + "монет");
        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll() + forChildren.ticketPriceAll() + forPencioners.ticketPriceAll()) + "монет");

    }
}