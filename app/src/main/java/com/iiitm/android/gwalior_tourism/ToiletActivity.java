package com.iiitm.android.gwalior_tourism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.UiSettings;

import java.util.ArrayList;
import java.util.List;

public class ToiletActivity extends AppCompatActivity {
    public List<Adaptertoilets> adaptertoiletsList = new ArrayList<>();
    MovieAdaptertoilets movieAdaptertoilets;
    boolean status = false;
    MapFragment map;
    UiSettings mapSettings;
//    toiletFragment t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintoilet);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Toilets");
        movieAdaptertoilets = new MovieAdaptertoilets(adaptertoiletsList, this);
        recyclerView.setAdapter(movieAdaptertoilets);
        prepareMovieData();

//
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        if(!status){
//            t1=new toiletFragment();
//            fragmentTransaction.add(R.id.fragmenttoilet,t1).commit();
//
//        }
    }


//    @Override
//    public void onRequestPermissionsResult(int requestCode,
//                                           String permissions[], int[] grantResults) {
//        if (requestCode == toiletFragment.MY_PERMISSIONS_REQUEST_LOCATION){
//            t1.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        }
//        else {
//            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        }
//    }

    private void prepareMovieData() {


        Adaptertoilets a = new Adaptertoilets("Sulabh Jan Suvidha Kendra","Public Bathroom","24 Hours"," Victoria Market, Near Choupati, Phool Bagh Rd, Phool Bagh, Lashkar, Gwalior, Madhya Pradesh 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya Complex","Public Bathroom","7:30AM–9:00PM","Near Boat Club, Phool Bagh, Gwalior, Madhya Pradesh 474007");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay Complex","Public Bathroom","24 Hours","Khulaa Santar, Sardar Bazar, Morar, Gwalior, Madhya Pradesh 47400");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sauchalay","Public Bathroom","24 Hours"," Laxmi Ganj, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours"," RVS Agriculture University Campus, Thatipur, Gwalior, Madhya Pradesh 474011");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours","National Highway 92, Morar, Gwalior, Madhya Pradesh 474004");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shauchalaya","Public Bathroom","24 Hours"," Gwalior, Jayendraganj, Shinde Ki Chhawani, Gwalior, Madhya Pradesh 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Swacch Public Toilet","Public Bathroom","24 Hours"," Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh 474009");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Government Toilet","Public Bathroom","24 Hours","  Near Naugaja Rd, Shinde Ki Chhawani, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Swacch Public Toilet","Public Bathroom","24 Hours"," Maharana Pratap Nagar, Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Toilets","Public Bathroom","24 Hours"," Pardhi Mohalla, Shekh Ki Bagiya, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Bio Toilet","Public Bathroom","24 Hours"," Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Samudayik Shauchalay","Public Bathroom","24 Hours"," Ghasmandi, Mirjapur, Ghatampur, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Shuchalay Complex","Public Bathroom","24 Hours"," Madhav Dispensary, Hospital Rd, Lashkar, Gwalior, ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Public Urinal","Public Bathroom","24 Hours"," Sarafa Bazar, Bada, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);
        a = new Adaptertoilets("Sulabh Sauchalaya","Public Bathroom","24 Hours"," Kampoo, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Complex","Public Bathroom","24 Hours","Jawahar Colony, Ward No. 46, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("City Sochalaya","Public Bathroom","24 Hours"," Mayur Nagar, Thatipur, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);



       a = new Adaptertoilets("Sulabh Shauchalay","Public Bathroom","24 Hours"," Jinsi Nala No: 1, Untpul, Gwalior, Madhya Pradesh ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Shauchalay Complex","Public Bathroom","24 Hours"," Lalitpur Colony, Lashkar, Gwalior, Madhya Pradesh");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Sauchalay","Public Bathroom","24 Hours"," City Center, Tulsi Vihar Colony, Gwalior, Madhya Pradesh 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Nagar Nigam Sauchalaya","Public Bathroom","24 Hours"," Mahalgaon, Gwalior, Madhya Pradesh 474002 ");
        adaptertoiletsList.add(a);


        a = new Adaptertoilets("Sulabh Shauchalaya Complex","Public Bathroom","24 Hours"," J. A. Hospital Campus, Lashkar, Gwalior, Madhya Pradesh 474009 ");
        adaptertoiletsList.add(a);

        a = new Adaptertoilets("Sulabh Sochalay Complex","Public Bathroom","24 Hours"," Sindi Colony Rd, Gwalior, Madhya Pradesh 474001");
        adaptertoiletsList.add(a);
    }
}
