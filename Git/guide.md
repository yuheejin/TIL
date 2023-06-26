***
## 개념 알고가기
- Local : 내 PC의 저장소 (repository)
- Remote : 여러 사람이 함께 공유하기 위한 저장소, 원격 저장소 전용 서버에서 관리됨
- origin : github의 저장소, github의 사이트 링크
- branch : commit 사이를 이동할 수 있는 포인터
- HEAD : 지금 작업하는 Local branch를 가리키는 포인터

<br>

- `add` - working directory의 변경 내용을 staging area에 추가하는 행위<br>
  - working directory -> staging area
- `commit` -  생성한 코드의 버전을 저장하는 행위<br>
  - staging area -> local repository
  - Local에서 저장한 뒤에 커밋할 것
  - 커밋메시지에 어떤 내용을 변경했는지 간단명료하게 작성할 것
      - 변경된 사항이 명확하면 변경사항을 되돌릴때 구분하기 편하다.
- `push` - github에 등록하는 행위<br> 
  - local repository -> remote repository
- `pull` - github에 등록된 이력을 내 Local로 가져오는 행위<br>
    - remote repository -> local repository
- `clone` - 다른 사람의 github에 있는 repository를 그대로 받아오는 행위
- `revert` - 선택한 시점으로 돌아가는 행위, 현 시점뒤에 선택한 시점의 내용이 추가된다.
- `reset` - 선택한 시점으로 돌아가는 행위, 선택한 시점 이후에 commit된 내용은 삭제된다.

***
## Merge & Rebase
업데이트 하기

***
## .gitignore

Git의 관리에서 특정 파일/폴더를 배제해야 할 경우<br>
- 포함할 필요가 없을 때 :  
  자동으로 생성 또는 다운로드되는 파일들 (빌드 결과물, 라이브러리 등)<br><br>
- 포함하지 말아야 할 때 :  
  보안상 민감한 정보를 담은 파일 (서버 비밀번호 등)

.gitignore 파일을 사용해서 배제할 요소들을 지정할 수 있다.

### 사용방법
`.gitignoer` 파일 생성 후, 파일 안에 배제해야하는 파일이나 폴더의 경로를 작성/저장한다.
```.ignorelang
# 은 주석이다.

# 모든 file.c
file.c

# 최상위 폴더의 file.c
/file.c

# 모든 .c 확장자 파일
*.c

# .c 확장자지만 무시하지 않을 파일
!not_ignore_this.c

# logs란 이름의 파일 또는 폴더와 그 내용들
logs

# logs란 이름의 폴더와 그 내용들
logs/

# logs 폴더 바로 안의 debug.log와 .c 파일들
logs/debug.log
logs/*.c

# logs 폴더 바로 안, 또는 그 안의 다른 폴더(들) 안의 debug.log
logs/**/debug.log
```

***
## 참고
- [git](https://git-scm.com/docs)
- [얄팍한 코딩사전 - 제대로 파는 Git & GitHub](https://www.youtube.com/watch?v=1I3hMwQU6GU)
- [얄팍한 코딩사전 - 무료파트 보조교재](https://www.yalco.kr/lectures/git-github/)