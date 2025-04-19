# Tree
모든 Tree 유형을 알아보겠다.

## 기본 용어
간략하게 Tree에 쓰이는 용어에 대해 살펴 보겠다.
- Node (노드): 각 데이터를 저장하는 원소다.
    - Root Node: 뿌리 노드는 부모가 없는 최상위 루트 노드다. 트리는 하나의 루트 노드로 가지며, 시작하는 지점이라 봐도 무방하다.
    - Child Node: 자식 노드는 부모로 부터 연결이 되는 노드다.
    - Parent Node: 부모 노드는 자식 노드가 한개 이상을 가지고 있는 노드다.
    - Leaf Node: 리프 노드는 제일 아래에 있는 노드다.
    - Internal Node: 뿌리와 리프 노드가 아닌 노드다.
- Branch: 가지는 edge, link 라고도 불리며 두 노드를 연결해 주는 선이다.
- Height: 높이는 루트 노드로 부터 시작하는 길이다.
- Level: 레밸은 높이랑 비슷한 개념이며, 특정 깊이를 가지고 있는 
- Sub-Tree: 트리를 노드 A를 기준으로 왼쪽 자식 노드 B 가 Left Sub-Tree의 루트 노드고, 오른쪽 자식 노드 C가 Right Sub-Tree의 루트 노드다.

## Binary Tree (이진 트리)
이진 트리는 자식 노드가 최대 2개를 가지고 있는 트리다. 원소를 삽입할떄 자식 노드가 두개이면 리프노드에 추가를 한다.

## Binary Search Tree (BST, 이진 탐색 트리)

다음과 같은 특징을 유지한다.

$ \text{왼쪽 자식 노드 값} \leq \text{부모 노드 값} \leq \text{오른쪽 자식 노드 값}$
### Adelson-Velsky and Landis (AVL) Tree
BST의 특성을 유지하며, 각 노드의 높이 차이가 1 이하로 유지되도록 균형을 맞춘다.
검색 속도는 $O(log(n))$으로 트리의 높이 만큼 걸린다.


## Segment Tree

## Red Black Tree

## B- Tree & B+ Tree
B-Tree는 여러 자식을 가지는 균형 트리 구조
반면에 B+Tree는 리프 노트에만 데이터를 저장한다.