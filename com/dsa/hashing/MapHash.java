//practicing

package com.dsa.hashing;

class MapHash {
    private Entity[] entities;

    public MapHash(){
        entities = new Entity[100];
    }
    //Insert 
    public void put(Integer key,Integer value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }
    // Get value
    public Integer get(Integer key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    // remove
    public void remove(Integer key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    private class Entity{
        Integer key;
        Integer value;

        public Entity(Integer key, Integer value){
            this.key = key;
            this.value = value;
        }
    }
}
class Main{
    public static void main(String[] args) {
        MapHash map1 = new MapHash();
        map1.put(56774,2626);
        map1.put(7853,4556);
        map1.put(56774,1111);

        System.out.println(map1.get(56774));
    }
}
