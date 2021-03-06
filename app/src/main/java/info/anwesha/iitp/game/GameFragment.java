package info.anwesha.iitp.game;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


import info.anwesha.iitp.R;

public class GameFragment extends Fragment {

    WebView gameView;
    public GameFragment() {
        // Required empty public constructor
    }
    public static GameFragment newInstance(String param1, String param2) {
        GameFragment fragment = new GameFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_game, container, false);
        gameView=rootView.findViewById(R.id.gameWebView);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gameView.loadUrl("https://5de6b07d668a1b74c0882d39--agitated-agnesi-547910.netlify.com/");
        WebSettings webSettings = gameView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
