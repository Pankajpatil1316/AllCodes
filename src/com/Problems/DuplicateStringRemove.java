package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateStringRemove {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("msg1", "MSG1", "Welcome", "welcome"));
        List<String> result = new ArrayList<>();
        List<String> seen = new ArrayList<>();

//        for(String word : list)
//        {
//            if(!seen.contains(word.toLowerCase()))
//            {
//                seen.add(word.toLowerCase());
//                result.add(word);
//            }
//        }

        for(int i=0; i<list.size(); i++)
        {
            for (int j=i+1; j<list.size(); j++)
            {
                if(list.get(i).equalsIgnoreCase(list.get(j)))
                {
                    list.remove(j);
                    j--;
                }
            }
        }


        System.out.println(list);

    }
}
