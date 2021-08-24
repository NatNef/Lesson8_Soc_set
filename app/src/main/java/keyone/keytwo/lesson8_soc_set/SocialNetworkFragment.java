package keyone.keytwo.lesson8_soc_set;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SocialNetworkFragment extends Fragment {

    public static SocialNetworkFragment newInstance()
    {return new SocialNetworkFragment();

    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_social_network, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        //зададим для всех элементов одинаковые размеры
        recyclerView.setHasFixedSize(true);

        //получили данные
        String[] data = getResources().getStringArray(R.array.test_title);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());  // отвечает за размещение элементов в RecyclerViewБ будут вертикально вниз
        recyclerView.setLayoutManager(layoutManager);

        SocialNetworkAdapter socialNetworkAdapter = new SocialNetworkAdapter(data);

        // прикрепим адаптер к списку
        recyclerView.setAdapter(socialNetworkAdapter);

        return view;
    }
}
