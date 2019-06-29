package com.sda.exercises.selectSort;

import java.util.List;

public class SelectSort {

    public List<Integer> sort (List<Integer> unsortedList) {
        for (int i=0; i < unsortedList.size(); i++){

            //find the minimum element

            int minumumIndex = i;
            for (int j = i+1; j < unsortedList.size(); j++)
                if (unsortedList.get(j) < unsortedList.get(minumumIndex))
                    minumumIndex = j;

                //swap elements

            Integer temp = unsortedList.get(minumumIndex);
            unsortedList.set(minumumIndex, unsortedList.get(i));
            unsortedList.set(i, temp);

        }

        return unsortedList;
    }
}


