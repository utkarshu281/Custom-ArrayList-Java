package Part12.TypeParameter;

public class MylList <Type>{
    private Type[] values;
    private int firstFreeIndex;
    public MylList(){
        this.values=(Type[]) new Object[10];
    }
    public void add(Type value){
        if(this.firstFreeIndex==this.values.length){
            grow();
        }
        this.values[this.firstFreeIndex]=value;
        this.firstFreeIndex++;
    }
    public void grow(){
        int newSize = this.values.length+this.values.length/2;
        Type[] newArray = (Type[]) new Object[newSize];
        for(int i=0;i<this.values.length;i++){
            newArray[i]=this.values[i];
        }
        this.values=newArray;
    }
    public boolean contains(Type value){
        for(int i=0; i<this.firstFreeIndex;i++){
            if(this.values[i].equals(value))return true;
        }
        return false;
    }
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public void remove(Type value){
        int indexOfvalue=indexOfValue(value);
        for(int j=indexOfvalue;j<this.firstFreeIndex-1;j++){
            this.values[j]=this.values[j+1];
        }
        this.values[this.firstFreeIndex-1]=null;
        this.firstFreeIndex--;
    }
    public Type value(int index){
        if(index<0||index>this.values.length){
            throw new IllegalArgumentException("indexoutofbond");
        }
        return this.values[index];
    }
    public int size() {
        return this.firstFreeIndex;
    }
}
