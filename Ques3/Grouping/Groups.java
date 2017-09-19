package Grouping;

/*
 * Given a list of numbers, see if you can separate them in to k groups such that each group has the same sum. 
 * 
 * Time complexity : 
 * 
 * Space complexity :
 */
import java.util.ArrayList;
import java.util.List;

public class Groups {

	//function to get sum of elements of list
	public int getSum(List<Integer> sublist) {
		int sum = 0;
		for(int i = 0; i < sublist.size(); i++) {
			sum += sublist.get(i);
		}
		
		return sum;
	}
	
	public boolean isGroups(List<Integer> list, int[] isVisited, List<Integer>[] sublists, int group_sum, int no_of_group, int current_sublist, int length ,int end) {
		
		
		int  tempsum = getSum(sublists[current_sublist]);
	
		//System.out.println("tempsum  : " + tempsum);
		
		if( tempsum == group_sum) {
			
			if(current_sublist == no_of_group-2){
				
				return true;
			}
			return isGroups(list, isVisited, sublists, group_sum, no_of_group, current_sublist+1, length, length-1);
		}
		
		for(int i = end; i >= 0; i--) {
			
			if(isVisited[i] == 1)
				continue;
			
			int temp = tempsum + list.get(i);
			
			if(temp <= group_sum) {
				
				isVisited[i] = 1;
				sublists[current_sublist].add(list.get(i));
			
				boolean result = isGroups(list, isVisited, sublists, group_sum, no_of_group, current_sublist, length, i-1);
				if(result)
					return true;
			}
			
		}
		return false;
		
	}
	
	public boolean seperate (List<Integer> list, int k) {
		
		boolean result = false;
		int total_sum = 0;
		int group_sum = 0; 
		int length  = list.size();
		
		//array to maintain status of each element(visited or not)
		int[] isVisited = new int[length];
		
		//array of lists to maintain groups 
		//if 2 groups then array of two lists
		List<Integer>[] sublists = new ArrayList[k];
		
		for (int i = 0; i < sublists.length; i++) {
			sublists[i] = new ArrayList<Integer>();
        }
		
		//total sum of elements in the input list
		for(int element : list) {
			total_sum = total_sum + element;
		}
		
		//if number of input elements are less than no of groups
		if(length < k) {
			result  = false;
			return result;
		}
		
		//no of group is 1
		if(k == 1)
		{
			result = true;
			return result;
		}
		
		//check if we can divide total sum into desired no of groups
		if(total_sum % k == 0) {
		
			group_sum = total_sum/k;
			result = isGroups(list,isVisited,sublists,group_sum,k,0,length,length-1);
		}
		
		return result;
	}
	public static void main(String args[]) {
		Groups obj = new Groups();
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(6);
		input.add(1);
		
		int k = 2;
		
		System.out.println(" Input is : ");
		for(int element : input) {
			System.out.print(" " + element);
		}
		
		System.out.println("\n Can group into " + k + " groups : " + obj.seperate(input, k));
	}
	
}
