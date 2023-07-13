# 1. JDK 다운로드 ver. 11.0.19  
https://www.oracle.com/java/technologies/downloads/#java11-windows

# 2. java version 확인  
- 파일 탐색기 > 프로그램파일 > 자바 에서 확인
- cmd open
```cmd
C:\Users\user>javac -version
javac 11.0.19

C:\Users\user>java -version
java version "11.0.19" 2023-04-18 LTS
Java(TM) SE Runtime Environment 18.9 (build 11.0.19+9-LTS-224)
Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.19+9-LTS-224, mixed mode)
```

# 3. 환경변수 설정  
내PC > 속성 > 고급시스템설정 > 환경변수 > 새로만들기 > JAVA_HOME 추가
                                        path > %JAVA_HOME%\bin 추가

환경변수 창에서 'user에 대한 사용자 변수'에는 user만 설정, '시스템변수'에는 모든 사용자에 설정
