package flyweight_pattern;

import java.util.HashMap;

public class FlyWeightFactory {
    private HashMap<String, ConcreteFlyWeight> pool = new HashMap<>();

    public FlyWeight getFlyWeightCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteFlyWeight(type));
        }

        return (FlyWeight)pool.get(type);
    }
}
