package sec01;

class keyValue<k, v>{
    private k key;
    private v value;

    public keyValue(k key, v value){
        this.key = key;
        this.value = value;
    }

    public v getValue(k key){
        if(key == this.key){
            return this.value;
        }
        return null;
    }
}

class key{
}

public class Main{
    public static void main(String[] args){

        key k1 = new key();
        key k2 = new key();

        keyValue<key, String> kv = new keyValue<>(k1, "hi");
        System.out.println(kv.getValue(k1));
        System.out.println(kv.getValue(k2));
    }
}