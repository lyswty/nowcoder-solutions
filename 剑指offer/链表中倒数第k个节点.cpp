/*
struct ListNode {
	int val;
	struct ListNode *next;
	ListNode(int x) :
			val(x), next(NULL) {
	}
};*/
class Solution {
public:
    ListNode* FindKthToTail(ListNode* pListHead, unsigned int k) {
        auto fast = pListHead, slow = pListHead;
        while (fast && k--) fast = fast -> next;
        if (!fast && k) return NULL;
        while (fast){
            fast = fast -> next;
            slow = slow -> next;
        }
        return slow;
    }
};