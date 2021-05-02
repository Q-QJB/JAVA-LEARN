#pragma once

#include <stdio.h>
#include <stdlib.h>

typedef int SLTDataType;
struct SListNode
{
	SLTDataType data;
	struct SListNode* next;
};
typedef struct SListNode SLTNode;

void SListPrint(SLTNode* phead);

void SlistPushBack(SLTNode** pphead,SLTDataType x);
void SlistPushFront(SLTNode** pphead,SLTDataType x);
void SlistPopFront(SLTNode** pphead);
void SlistPopBack(SLTNode** pphead);

SLTNode* SListFind(SLTNode* phead,SLTDataType x);
//��pos��ǰ�����x
void SlistInsert(SLTNode** pphead,SLTNode* pos,SLTDataType x);
//ɾ��posλ�õ�ֵ
void SlistErase(SLTNode** pphead,SLTNode* pos);
