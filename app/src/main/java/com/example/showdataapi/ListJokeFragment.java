package com.example.showdataapi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListJokeFragment extends Fragment {
    private ArrayList<Joke> jokes = new ArrayList<>();
    TextView dataShow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_list_joke, container, false);
        dataShow = inflate.findViewById(R.id.data);

        Call<ArrayList<Joke>> caller = RetrofitClient.getInstance().getMyApi().getJokes();
//        network call (dilakukan di background)
        caller.enqueue(new Callback<ArrayList<Joke>>() {
            @Override
            public void onResponse(Call<ArrayList<Joke>> call, Response<ArrayList<Joke>> response) {
                jokes = response.body();
                String data = "";

                for (int i=0; i<jokes.size(); i++){
                    Joke currentJoke = jokes.get(i);
                    data += "Setup : " + currentJoke.getSetup() +
                            "\nPunchline : " + currentJoke.getPunchline() + "\n\n";
                }
                dataShow.setText(data);
            }

            @Override
            public void onFailure(Call<ArrayList<Joke>> call, Throwable t) {

            }
        });
        // Inflate the layout for this fragment
        return inflate;
    }
}