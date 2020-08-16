import java.util.*;

class Program {
  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
    // Write your code here.
		if (arrayOne.size() != arrayTwo.size()){
			return false;
		}
		if (arrayOne.size()==0 && arrayTwo.size()==0) return true;
		if(arrayOne.get(0) != arrayTwo.get(0)){
			return false;
		}
		
		List<Integer> smallerOneList= getSmaller(arrayOne);
		List<Integer> smallerTwoList= getSmaller(arrayTwo);
		List<Integer> largerOneList= getBiggerorequal(arrayOne);
		List<Integer> largerTwoList= getBiggerorequal(arrayTwo);
	  return sameBsts(smallerOneList, smallerTwoList) && sameBsts(largerOneList, largerTwoList);
  }
	public static List<Integer> getSmaller(List<Integer> array){
		List<Integer> smallersList = new ArrayList<Integer>();
		for(int i = 1 ; i < array.size(); i++){
			if(array.get(i)< array.get(0)){
				smallersList.add(array.get(i));
			}
		}
		return smallersList;
	}
	public static List<Integer> getBiggerorequal(List<Integer> array){
		List<Integer> largerList = new ArrayList<Integer>();
		for(int i = 1 ; i < array.size(); i++){
			if(array.get(i) >= array.get(0)){
				largerList.add(array.get(i));
			}
		}
		return largerList;
	}
	
}
