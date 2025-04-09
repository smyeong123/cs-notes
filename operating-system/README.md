# Operating System

노트 주제 및 핵심내용
## Kernel (커널)
정의: OS의 핵심으로 하드웨어와 소프트웨어를 연결하는 인터페이스.

기능: 프로세스 관리, 메모리 관리, 하드웨어 자원 제어, 시스템 호출 관리.

구조 분류:

Monolithic Kernel: 커널의 모든 기능을 하나의 큰 프로그램으로 구성.

Microkernel: 커널의 최소한의 핵심 기능만 유지, 나머지는 사용자 영역에서 수행.

## Process, Thread, Scheduling (프로세스, 쓰레드, 스케줄링)
프로세스:

독립적인 실행 단위로, 프로그램이 실행 중인 상태.

프로세스 상태: New, Ready, Running, Waiting, Terminated.

PCB(Process Control Block): 프로세스 상태 및 정보를 저장하는 자료구조.

쓰레드:

프로세스 내부의 작은 실행 단위. 프로세스 내 자원을 공유.

멀티쓰레딩 장점: 리소스 공유, 성능 향상, 효율적 자원 활용.

스케줄링:

CPU 자원을 프로세스/쓰레드에 할당하는 전략.

알고리즘: FCFS(First Come First Served), Round Robin, SJF(Shortest Job First), Priority Scheduling.

## Virtual Memory (가상 메모리)
정의: 실제 물리적 메모리보다 큰 논리적 주소 공간 제공.

장점:

큰 프로그램 실행 가능.

메모리 효율적 사용.

페이지 교체 알고리즘: FIFO, LRU(Least Recently Used), Optimal.

## Address Translation, Paging, Swapping (주소 변환, 페이징, 스와핑)
주소 변환(Address Translation):

가상 주소를 물리 주소로 변환하는 과정.

MMU(Memory Management Unit)가 수행.

페이징(Paging):

메모리를 고정 크기 페이지로 나누어 관리.

페이지 테이블(Page Table)을 이용한 가상 메모리 관리.

스와핑(Swapping):

물리 메모리 부족 시, 일부 페이지를 디스크로 이동.

페이지 폴트(Page Fault): 필요한 페이지가 메모리에 없을 때 발생.

## Concurrency (병행성)
정의: 여러 프로세스 또는 쓰레드가 동시에 수행되는 상태.

주요 문제: Race condition(경쟁 상태), Deadlock(교착 상태), Starvation(기아 상태).

동기화 기법:

Lock: 상호 배제(mutual exclusion) 보장.

Conditional Variable: 특정 조건을 만족할 때까지 쓰레드를 대기시키는 동기화 도구.

Semaphore: 공유 자원 접근을 제어하는 카운팅 기반 동기화 도구.

## Storage (스토리지, 저장장치)
정의: 데이터를 저장하는 하드웨어 자원.

주요 매체: HDD, SSD, DRAM, Cache Memory.

계층적 저장 구조: 레지스터 → 캐시 → 주메모리 → 2차 저장장치.

## File System, Crash Consistency (파일 시스템, 충돌 일관성)
파일 시스템(File System):

파일을 저장하고 관리하는 시스템.

주요 방식: 연속 할당(Contiguous), 연결 할당(Linked), 색인 할당(Indexed).

Crash Consistency(충돌 일관성):

충돌 발생 시 파일 시스템 상태의 정합성 유지.

기법: Journaling, 로그 기반 복구(Log-structured recovery).