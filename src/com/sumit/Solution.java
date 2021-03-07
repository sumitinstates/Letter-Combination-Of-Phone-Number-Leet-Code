package com.sumit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
	public static List<String> letterCombinations(String digits) {
        
	    HashMap<Character, String> hm = new HashMap<Character, String>();
	    hm.put('2',"abc");
	    hm.put('3',"def");
	    hm.put('4',"ghi");
	    hm.put('5',"jkl");
	    hm.put('6',"mno");
	    hm.put('7',"pqrs");
	    hm.put('8',"tuv");
	    hm.put('9',"wxyz");
	        
	        List<String> res = new ArrayList<String>();
	        
	        if(digits == null || digits.isEmpty())
	            return res;
	        
	        backtrack(res,"",digits,0,hm);
	        return res;
	    
	    }
	    
	    private static void backtrack(List<String>res,String combination,String digits,int index,HashMap<Character, String>hm)
	    {
	        if(digits.length()==combination.length()){
	            res.add(combination);
	            return;
	        }
	            
	            String value = hm.get(digits.charAt(index));
	            char[] c = value.toCharArray();
	            
	            for(int j=0;j<c.length;j++){
	                backtrack(res,combination+c[j],digits,index+1,hm);
	            }
	    }
	public static void main(String[] args) {
		
		String digits = "23";
		System.out.println(letterCombinations(digits));
		
		
	}   
    

}
