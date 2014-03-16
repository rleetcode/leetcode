#include<iostream>
using namespace std;

class Node{
public: 
	int val;
	Node* next;
	Node(int v){
		val = v;
		next = NULL;
	}
};

bool findjun(const Node *h1, const Node *h2){
	if(h1 == h2){
		return true;
	}
	int lenh1 = 0;
	int lenh2 = 0;
	const Node *left = h1;
	const Node *right= h2;
	while(left){
		left = left->next;
		lenh1++;
	}
	while(right){
		right = right->next;
		lenh2++;
	}
	left = h1;
	right= h2;
	
	if(lenh1>lenh2){
		left = left->next;
		lenh1--;
	}else if(lenh1<lenh2){
		right = right->next;
		lenh2--;
	}
	while(left!=NULL){
		if(left == right){
			return true;
		}else{
			left = left->next;
			right= right->next;
		}
	}
	return false;
}

int main(){
// 	Node *h1 = new Node(0);
// 	Node *l = h1;
// 	for(int i=1;i<=5;i++){
// 		Node *temp = new Node(i);
// 		l->next = temp;
// 		l = temp;
// 	}
// 	Node *h2 = new Node(10);
// 	l = h2;
// 	for(int i=11;i<=15;i++){
// 		Node *temp = new Node(i);
// 		l->next = temp;
// 		l = temp;
// 	}
// 	
// 	bool result = findjun(h1,h2);
// 	cout << "result: " ;//<< result << "\n"; 
	
	return true;
}