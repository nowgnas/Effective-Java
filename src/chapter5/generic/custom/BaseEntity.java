package chapter5.generic.custom;

public class BaseEntity<ID extends Number> {

    ID userId;

    public BaseEntity(ID userId) {
        this.userId = userId;
    }

    public static void main(String[] args) {
        long a = 2L;
        BaseEntity baseEntity = new BaseEntity(a);
    }
}
