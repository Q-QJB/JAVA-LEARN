#include "SList.h"

void SListPrint(SLTNode* phead)
{
	SLTNode* cur = phead;
	while(cur!=NULL)
	{
		printf("%d->",cur->data);
		cur=cur->next;
	}
	printf("NULL\n");
}

SLTNode* BuySListNode(SLTDataType x)//����һ���ڵ��������
{
	SLTNode* newnode = (SLTNode*)malloc(sizeof(SLTNode));
	newnode->data=x;
	newnode->next=NULL;
	return newnode;
}

void SlistPushBack(SLTNode** pphead,SLTDataType x)//β��
{
	SLTNode* newnode = BuySListNode(x);
	if(*pphead==NULL)
	{
		*pphead = newnode;
	}
	else
	{
		SLTNode* tail = *pphead;
		//�ҵ�β�ڵ�ָ��
		while(tail->next != NULL)
		{
			tail = tail->next;
		}
		//β�ڵ㣬�����½ڵ�
		tail->next = newnode;
	}
}

void SlistPushFront(SLTNode** pphead,SLTDataType x)//ͷ��
{
	SLTNode* newnode = BuySListNode(x);
	newnode->next = *pphead;
	*pphead = newnode;
}

void SlistPopFront(SLTNode** pphead)//ͷɾ
{
	SLTNode* next = (*pphead)->next;
	free(*pphead);
	*pphead = next;
}

void SlistPopBack(SLTNode** pphead)//βɾ
{
	if(*pphead == NULL)//��
	{
		return;
	}
	else if((*pphead)->next == NULL)//һ��
	{
		free(*pphead);
		*pphead = NULL;
	}
	else//���
	{
		SLTNode* prev = NULL;
		SLTNode* tail = *pphead;
		//SLTNode* tail1 = *pphead;
		//int n = 0;
		//int i = 0;

		//while(tail->next != NULL)
		//{
		//	tail = tail->next;
		//	n++;
		//}
		//for(i = 1;i<n;i++)
		//{
		//	tail1 = tail1->next;
		//}
		//tail1->next = NULL;
		//free(tail);
		while(tail->next != NULL)
		{
			prev = tail;
			tail = tail->next;
		}
		free(tail);
		prev->next = NULL;
	}
	
}

SLTNode* SListFind(SLTNode* phead,SLTDataType x)//����
{
	SLTNode* cur = phead;
	while(cur)
	{
		if(cur->data == x)
		{
			return cur;
		}
		cur = cur->next;
	}
	return NULL;

}

//��pos��ǰ�����x
void SlistInsert(SLTNode** pphead,SLTNode* pos,SLTDataType x)
{
	if(pos == *pphead)
	{
		SlistPushFront(pphead,x);
	}
	else
	{
		SLTNode* newnode = BuySListNode(x);
		SLTNode* prev = *pphead;
		while(prev->next != pos)
		{
			prev = prev->next;
		}
		prev->next = newnode;
		newnode->next = pos;
	}
}
//ɾ��posλ�õ�ֵ
void SlistErase(SLTNode** pphead,SLTNode* pos)
{
	if(pos == *pphead)
	{
		SlistPopFront(&* pphead);
	}
	else
	{
		SLTNode* prev = *pphead;
		while(prev->next != pos)
		{
			prev = prev->next;
		}
		prev->next=pos->next;
		free(pos);
	}
}