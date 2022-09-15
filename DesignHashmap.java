#Time complexity : O(1)
#Space complexity : O(1)

class MyHashMap {
      int[] arr;
    public MyHashMap() {
        arr= new int [1000001];
        Arrays.fill(arr,-1);
    }
    
    public void put(int key, int value) {
        arr[key]=value;
        
    }
    
    public int get(int key) {
     if(arr[key]!=-1)
     {
         return 1;
     }
        return -1;
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */