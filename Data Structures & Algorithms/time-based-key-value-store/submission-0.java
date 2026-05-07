class TimeMap {
    private Map<String, List<Pair<String,Integer>>> keyStore;
    public TimeMap() {
        keyStore=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyStore.containsKey(key)){
            keyStore.put(key,new ArrayList<>());
        }
        keyStore.get(key).add(new Pair<>(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res="";
        List<Pair< String, Integer >> values = keyStore.getOrDefault(key, new ArrayList<>());
        int l=0,r=values.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(values.get(mid).getValue() <= timestamp){
              res=values.get(mid).getKey();  
              l=mid+1;
            }
            else r=mid-1;
        }
        return res;

    }
}
