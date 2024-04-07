//  Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//  значение внутреннейint переменнойна 1.Сделайте так, чтобы с объектом
//  такого типа можно было работать в блоке try-with-resources. Нужно бросить
//  исключение, еслиработа с объектом типа счетчикбылане в ресурсномtry
//  и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
//  лучше всего.

import java.io.IOException;
import java.io.IOException;

public class Count implements AutoCloseable{
    private Integer count;

    public Count(){
        this.count = 0;
    }

    public void add() throws IOException{
        checkClose();
        this.count++;
    }

    public Integer getCount() throws IOException{
        checkClose();
        return count;
    }

    public void checkClose() throws IOException{
        if (this.count == null)
            throw new IOException("Экземпляр закрыт!");
    }

    @Override
    public void close(){
        this.count = null;
    }
}
