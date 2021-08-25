package keyone.keytwo.lesson8_soc_set;

//источник данных
public interface CardSourse {

    int size();

    //метод возврата данных карточки по значиени
    CardData getCardData(int position);
}
