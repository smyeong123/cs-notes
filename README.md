# Fundamental Knowledge of Computer Science 

## Table of Contents

- [ ] Programming Language / Compiler
- [ ] Computer Architecture
- [ ] Operating System
- [ ] Database
- [ ] Discrete Mathematics, Probability and Statistics
- [ ] Software Design
- [ ] Data Structure & Algorithm
- [ ] Computer Graphic
- [ ] AI/ML

## Rules
각자 맡은 주제 디렉토리를 생성해 다음과 같이 작성해주세요. md 파일은 하나만 작성할 필요가 없으며 필요에 따라 여러개 작성이 가능합니다. 
```
name-of-content/
├── _img/           # 이미지 파일 저장 폴더
├── _code/          # 코드 파일 저장 폴더
├── _resources/     # 참고 자료 저장 폴더
└── README.md       # 콘텐츠 설명 파일
```

## How to Contribute
### 브랜치 이름 규칙
기본적으로 다음과 같은 형식으로 브랜치를 만들어주세요:
```
[주제 이름]/[본인의 Git 아이디]
```
예시:
```
OS/yourgitid
DB/yourgitid
```
### 기여 절차
1. 저장소(repository)를 본인 계정으로 Fork 합니다.
2. Fork된 본인의 저장소를 로컬로 Clone 합니다.
3. 해당 명령어를 싱해주세요
```
git clone [본인의 저장소 주소]
git checkout -b [주제 이름]/[본인의 Git 아이디] # 새로운 브랜치를 위의 규칙에 따라 생성한 후 체크아웃(checkout) 합니다.
```
4. 필요한 작업(코드 작성, 문서 수정 등)을 진행합니다.
5. 작업이 완료되면 변경사항을 commit 하고 본인 저장소에 push 합니다.
예시:
```
git add .
git commit -m "수정 사항에 대한 간략한 설명"
git push origin [브랜치 이름]
```
5. 본인의 GitHub 저장소에서 프로젝트 원본 저장소로 Pull Request(PR)를 보냅니다.




