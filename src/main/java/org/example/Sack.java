package org.example;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// TODO: what is an arraylist?
// an iterable class
// capable of holding a finite (but adjustable) number of elements
// these elements are zero-indexed
// and can be deleted, found, added, while keeping with the indices

// TODO: our specific arraylist:
// needs to be able to hold arrays and primitives
// so ints, shorts, doubles, floats, longs, booleans,chars, bytes?

public class Sack <T>{
    public int index = 0;
    // I can think of no other way than manipulating arrays for this
    public int[] ints;
    public double[] doubles;
    public float[] floats;
    public byte[] bytes;
    public long[] longs;
    public boolean[] booleans;
    public short[] shorts;
    public char[] chars;
    public Array[] arrays;
    private T[] array;


// since there are nine primitive data types, we need 9 constructors?
    public Sack(Array[] array) {
        this.arrays = array;
    }
    public Sack(int[] ints) {
        this.ints = ints;
    }
    public Sack(double[] doubles) {
        this.doubles = doubles;
    }
    public Sack(float[] floats) {
        this.floats = floats;
    }
    public Sack(byte[] bytes) {
        this.bytes = bytes;
    }
    public Sack(long[] longs) {
        this.longs = longs;
    }
    public Sack(boolean[] booleans) {
        this.booleans = booleans;
    }
    public Sack(short[] shorts) {
        this.shorts = shorts;
    }
    public Sack(char[] chars) {
        this.chars = chars;
    }


    // TODO: will some methods only work for the primitive or the array arrays?
    // let's see

    // TODO; how to add regardless of data type? -generics?

//    public void add(T toBeAdded){
//        T[] temp = new T[this.array.length+1];
//        for(int i = 0; i < this.array.length; i++){
//            temp[i] = this.array[i];
//        }
//        temp[this.array.length] = toBeAdded;
//        this.array = temp;
//    }

    // yikes
//    public void add(int toBeAdded){
//        int[] temp = new int[this.ints.length+1];
//        for(int i = 0; i < this.ints.length; i++){
//            temp[i] = this.ints[i];
//        }
//        temp[this.ints.length] = toBeAdded;
//        this.ints = temp;
//    }
    public void add(char toBeAdded){
        char[] temp = new char[this.chars.length+1];
        for(int i = 0; i < this.chars.length; i++){
            temp[i] = this.chars[i];
        }
        temp[this.chars.length] = toBeAdded;
    }
    public void add(boolean toBeAdded){
        boolean[] temp = new boolean[this.booleans.length+1];
        for(int i = 0; i < this.booleans.length; i++){
            temp[i] = this.booleans[i];
        }
        temp[this.booleans.length] = toBeAdded;
    }
    public void add(double toBeAdded){
        double[] temp = new double[this.doubles.length+1];
        for(int i = 0; i < this.doubles.length; i++){
            temp[i] = this.doubles[i];
        }
        temp[this.doubles.length] = toBeAdded;
    }
    public void add(short toBeAdded){
        short[] temp = new short[this.shorts.length+1];
        for(int i = 0; i < this.shorts.length; i++){
            temp[i] = this.shorts[i];
        }
        temp[this.shorts.length] = toBeAdded;
    }
    public void add(long toBeAdded){
        long[] temp = new long[this.longs.length+1];
        for(int i = 0; i < this.longs.length; i++){
            temp[i] = this.longs[i];
        }
        temp[this.longs.length] = toBeAdded;
    }
    public void add(byte toBeAdded){
        byte[] temp = new byte[this.bytes.length+1];
        for(int i = 0; i < this.bytes.length; i++){
            temp[i] = this.bytes[i];
        }
        temp[this.bytes.length] = toBeAdded;
    }
    public void add(float toBeAdded){
        float[] temp = new float[this.floats.length+1];
        for(int i = 0; i < this.floats.length; i++){
            temp[i] = this.floats[i];
        }
        temp[this.floats.length] = toBeAdded;
    }

}