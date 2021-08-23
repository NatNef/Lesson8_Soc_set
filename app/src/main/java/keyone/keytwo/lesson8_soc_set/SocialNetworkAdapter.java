package keyone.keytwo.lesson8_soc_set;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// класс для обслуживания RecyclerView
public class SocialNetworkAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // задаем данные
    private String[] dadaSource;

    public SocialNetworkAdapter(String[] dadaSource) {
        this.dadaSource = dadaSource;
    }
//// можем на ходу передавать новые данные в String[] dadaSource
//    public void setData(String[] dadaSource){
//        this.dadaSource = dadaSource;
//    }



    // создаются элементы
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    //вернуть размер
    @Override
    public int getItemCount() {
        return dadaSource.length;
    }
}
