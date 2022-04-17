public class Array{
    private int[] data;
    private int size;

    public Array(int size){
        this.size = size;
        this.data = new int[size];
    }

    public void set(int index, int value){
        this.data[index] =  value;
    }

    public int get(int index){
        return this.data[index];
    }

    public int size(){
        return this.size;
    }

    public int indexOf(int value){
        for(int i = 0; i < this.size; i++){
            if(this.data[i] == value)
                return i;
        }
        
        return -1;
    }

    public boolean contains(int value){

        return indexOf(value) != -1;
    }
}