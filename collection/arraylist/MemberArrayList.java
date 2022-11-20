package collection.arraylist;

import java.util.ArrayList;
import collection.Member; 

public class MemberArrayList {
	
	private ArrayList<Member> arrayList = new ArrayList<>();
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()) {
			System.out.println("지정 된 자리에 추가할 수 없습니다.");
			return;
		}
		arrayList.add(index-1, member);
	}

}
