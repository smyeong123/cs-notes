# Heap

힙(Heap)은 **완전 이진 트리(Complete Binary Tree)**를 기반으로 한 자료구조로, **우선순위 큐(Priority Queue)**를 구현하는 데 주로 사용된다.

---

## Binary Heap

이진 힙은 **최대 힙(Max Heap)** 또는 **최소 힙(Min Heap)**으로 나뉘며, 다음과 같은 특징을 가진다:

### 특징
- **완전 이진 트리**를 기반으로 함
- **부모 노드와 자식 노드의 값 비교**를 통해 정렬 조건 유지
- 일반적으로 **배열(Array)**로 구현됨
    - 부모 인덱스 `i`의 자식 인덱스: `2i + 1`, `2i + 2`
    - 자식 인덱스 `j`의 부모 인덱스: `(j - 1) // 2`

### 종류

#### Max Heap
- 부모 노드 ≥ 자식 노드
- 루트 노드에는 **최대값**이 존재

#### Min Heap
- 부모 노드 ≤ 자식 노드
- 루트 노드에는 **최소값**이 존재

### 연산 및 시간복잡도
| 연산        | 시간복잡도 |
|-------------|------------|
| 삽입 (Insert) | $O(\log n)$ |
| 삭제 (Extract) | $O(\log n)$ |
| Peek (최댓값 또는 최솟값 조회) | $O(1)$ |

---

## Priority Queue (우선순위 큐)

우선순위 큐는 일반적인 큐(FIFO)와 달리 **우선순위가 높은 요소가 먼저 처리**되는 큐이다. Binary Heap으로 구현하는 것이 일반적이다.

### 사용 예시
- 운영체제의 스케줄링 (CPU 스케줄러)
- Dijkstra 알고리즘 (최단 경로)
- A* 알고리즘 (휴리스틱 탐색)
- 작업 스케줄링 시스템

### 구현 방식
- **Min Heap**: 낮은 숫자가 높은 우선순위일 때
- **Max Heap**: 높은 숫자가 높은 우선순위일 때

### Python 예시 (`heapq` 모듈)
```python
import heapq

# Min Heap
heap = []
heapq.heappush(heap, 3)
heapq.heappush(heap, 1)
heapq.heappush(heap, 4)
print(heapq.heappop(heap))  # 출력: 1

# Max Heap은 -값으로 처리
max_heap = []
heapq.heappush(max_heap, -3)
heapq.heappush(max_heap, -1)
heapq.heappush(max_heap, -4)
print(-heapq.heappop(max_heap))  # 출력: 4
