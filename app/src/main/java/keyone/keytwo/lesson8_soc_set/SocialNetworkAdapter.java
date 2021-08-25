package keyone.keytwo.lesson8_soc_set;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// класс для обслуживания RecyclerView
public class SocialNetworkAdapter extends RecyclerView.Adapter<SocialNetworkAdapter.MyViewHolder> {

    //xml файл -inflate- теперь он java - разбиваем этот объект на
    // оболочку MyViewHolder что-бы обращаться к его элементам  textView и imageView
    // достаем элементы public MyViewHolder и далее задаются значения onBindViewHolder


    private MyOnClickListener Listener;

    public void setMyOnClickListener(MyOnClickListener Listener){
        this.Listener = Listener;
    }

    // задаем данные
    private String[] dadaSource;

  //  private MyOnClickListener Listener;

    public SocialNetworkAdapter(String[] dadaSource) {
        this.dadaSource = dadaSource;
    }
//// можем на ходу передавать новые данные в String[] dadaSource
//    public void setData(String[] dadaSource){
//        this.dadaSource = dadaSource;
//    }





    // создаются элементы мы создаем для него оболочку MyViewHolder
    // делаем доступ к его полям TextView
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);

//        // вешаем клики
//        (view.findViewById(R.id.textView)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
////        MyViewHolder holder = new MyViewHolder(view);
////        holder.imageView
//

        return new MyViewHolder(view);
    }


    //связивает данные View со значением
    // прокрутился список и создается след элемент который уехал за экран
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(dadaSource[position]);
//        holder.imageView.setText(dadaSource[position]);

    }

    //вернуть размер. сколько прокручивается
    @Override
    public int getItemCount() {
        return dadaSource.length;
    }

    // внутри адаптера класс, будет предатсавлением в
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // элементы
        private TextView textView;
        private ImageView imageView;

//        public TextView getTextView() {
//            return textView;
//        }

//        public void setTextView(TextView textView) {
//            this.textView = textView;
//        }

 //приходят элементы и мы достаем
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            itemView = itemView.findViewById(R.id.imageView);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Listener.OnMyClick(v, getAdapterPosition()); // getAdapterPosition()) возвращает текущую позицию

                }
            });

        }
    }

}
