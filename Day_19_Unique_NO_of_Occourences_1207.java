// understand the question first 
// no this no valid way // in set values for each key should be different
// use one map and one set and understand code 
// in last that's a good learning 
// we can directly return by checking if size of map and set is same or not
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        //HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // Set<Integer> set = new HashSet<>(map.values());
        // return map.size() == set.size();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(set.contains(entry.getValue())) return false;
            
            set.add(entry.getValue());
        }
               
               return true;
    }
}
