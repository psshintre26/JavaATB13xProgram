package ex31_Generics;

public class Lab238_Generics_Class {
    GenericC g = new GenericC(10);
    GenericC g1 = new GenericC("gg");

}

class GenericC<T>{

    private T data;

    public GenericC(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
