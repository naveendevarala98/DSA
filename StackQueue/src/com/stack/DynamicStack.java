package com.stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            int[] tmp = new int[2*super.data.length];
            for(int i=0;i<data.length;i++){
                tmp[i]=data[i];
            }
            data=tmp;
        }

        return super.push(item);
    }
}
