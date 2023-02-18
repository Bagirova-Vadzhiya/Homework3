package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.homework3.Model.RailwayTicket;
import com.example.homework3.Model.RailwayTicketChild;
import com.example.homework3.Model.RailwayTicketPensioner;

public class MainActivity extends AppCompatActivity {
    // объкет сущности взрослых билетов
    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    //объект сущности детских билетов
   RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);
    // объект сущности билетов пенсионеров
    RailwayTicket railwayTicketPensioner = new RailwayTicketPensioner(70, 5, 30);
    //создание полей для вывода на экран
    private TextView railwayTicketOut;
    private TextView railwayTicketChildOut;
    private TextView railwayTicketPensionerOut;
    private TextView railwayTicketTotalOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketPensionerOut = findViewById(R.id.railwayTicketPensionerOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);
        //заполнение экрана
        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + " монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + " монет");
        railwayTicketPensionerOut.setText(Float.toString(railwayTicketPensioner.ticketPriceAll()) + " монет");
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + railwayTicketPensioner.ticketPriceAll()) + " монет");
    }
}