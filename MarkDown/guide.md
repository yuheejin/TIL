# MarkDown
Guide : https://www.markdownguide.org/getting-started/


## 1. MarkDown 이란?
텍스트 기반의 Markup Language이며, HTML로 변환이 가능하다.

#### <장점>
1. 지원하는 프로그램과 플랫폼이 다양하다.
2. 문법이 간단하다.
3. 텍스트로 저장되기 때문에 적은 용량으로 보관이 가능하다.
#### <단점>
1. 표준이 없다.
2. 모든 HTML을 대신하지 못한다.



## 2. MarkDown 문법
### 2.1. 제목(Header)
`<h1>`~ `<h6>`을 표현가능하며, 글씨 크기는 점점 작아진다.
```markdown
# This is 'h1'
## This is 'h2'
### This is 'h3'
#### This is 'h4'
##### This is 'h5'
###### This is 'h6'
```

# This is 'h1'
## This is 'h2'
### This is 'h3'
#### This is 'h4'
##### This is 'h5'
###### This is 'h6'

<br>`<h1>`과 `<h2>`는 아래와 같이 사용 가능하다. <br>
```markdown
This is 'h1'
=

This is 'h2'
-
```

`=`, `-` 말고, #을 사용하는 것이 더 편하다. <br>
`=`, `-`은 '1. 제목'에 적용했을때, 리스트로 변환되기 때문이다.



### 2.2. 강조 (Emphasis)
`<em>`, `<strong>`, `<del>` 태그 <br>
- `<em>`은  `*` 또는 `_` 를 사용한다.
- `<strong>` 은  `**` 또는 `__`  를 사용한다.
- `<del>` 은 `~~` 을 사용한다.
- 밑줄은 `<u></u>` 태그를 사용한다.
```markdown
*가나다라* _마바사_  
**아자차카** __타파하__  
**_하나 둘 셋_ 넷**  
~~일 이 삼 사~~  
<u>markdown 참 쉽죠?</u>
```
*가나다라* _마바사_  
**아자차카** __타파하__  
**_하나 둘 셋_ 넷**  
~~일 이 삼 사~~  
<u>markdown 참 쉽죠?</u>



### 2.3. 줄바꿈 (Line Breaks)
`<br>` 태그 <br><br>
Enter가 적용되지 않는 경우, `띄어쓰기 2번` 혹은 `<br>`을 사용한다.
```markdown
눈을 감고 내가 하는 이야길 잘 들어봐  <!--띄어쓰기 2번-->  
나의 얘기가 끝나기 전에 너는 꿈을 꿀 거야<br>
little star tonight<br>밤새 내가 지켜줄 거야<br>  <!--띄어쓰기 2번-->  
< 스탠딩에그 'little star' 중 >
```
눈을 감고 내가 하는 이야길 잘 들어봐  <!--띄어쓰기 2번-->  
나의 얘기가 끝나기 전에 너는 꿈을 꿀 거야<br>
little star tonight<br>밤새 내가 지켜줄 거야<br>  <!--띄어쓰기 2번-->  
< 스탠딩에그 'little star' 중 >



### 2.4. 수평선 (Horizontal Rule)
`<hr>` 로 변환 된다.<br><br>
`-`, `*`, `_` 셋 중 하나를 세번 이상 입력한다.
```markdown
---
***
___
```
---
***
___
<br>



### 2.5. 인용문 (BlockQuote)
`<blockquote>` 태그<br>  
`>` 를 사용한다.
```markdown
> 인용문
> > 인용문의 인용문
> > > 인용문의 인용문의 인용문
```
> 인용문
> > 인용문의 인용문
> > > 인용문의 인용문의 인용문



### 2.6. 코드블럭 (Code Block)
`<pre>`, `<code>` 코드<br>  
~와 같은 키에 있는 ` `` 를 3번이상 입력한다.  
사용한 언어를 선언해주면 문법이 강조된다. (필수 아님)

```markdown
```java
System.out.println();
```  <!-- 코드 블럭이 끝나는 지점에 똑같이 ```를 입력한다. -->
```
블럭이 아닌 라인 안에서 사용할 경우, 세번이 아닌 한번만 사용한다.
```markdown
이렇게 `한번만` 사용해주세요.
```
이렇게 `한번만` 사용해주세요.



### 2.7. 목록 (List)
`<ol>`, `<ul>` 태그<br><br>
`숫자 + 점` 을 사용한다.<br>
숫자는 어떤숫자를 사용하든 1부터 순차로 매겨진다.

```markdown
1. 첫번째
0. 두번째
2. 세번째
```
1. 첫번째
0. 두번째
2. 세번째

순서에 관계없는 list는 `*`, `+`, `-`를 사용한다. <br>
셋중 어느 것을 사용해도 무방하다.
```markdown
* 이것
+ 저것
    - 그것
```
* 이것
+ 저것
    - 그것



### 2.8. 표 (Table)
`<table>` 태그<br>
- 헤더 구분 : 3개 이상의 `-` 사용한다.
- 정렬 : 헤더 구분할때 `:`를 사용하여 각 열의 정렬을 정의할 수 있다.
- 가장 좌측과 가장 우측에 있는 `|`은 생략 가능하다.

```markdown
이름|연락처|주소
---:|:---:|---
김아름|010-0000-0000|서울특별시 송파구
서아름다운|010-1111-1111|경기도 구리시
```
이름|연락처|주소
---:|:---:|---
김아름|010-0000-0000|서울특별시 송파구
서아름다운|010-1111-1111|경기도 구리시



### 2.9. 링크 (Links)
`<a>` 태그 <br>
- 참조링크
```markdown
//문법
[Title][id]

[id]: URL "Optional Title here"

//예시
Link: [Google][googlelink]

[googlelink]: https://google.com "Go google"
```
Link: [Google][googlelink]

[googlelink]: https://google.com "Go google"

- 외부링크
```markdown
//문법
[Title](link)

//예시
Link: [Google](https://google.com, "google link")
```
Link: [Google](https://google.com, "google link")

- 자동연결 : URL을 직접적으로 드러낼 경우
```markdown
외부링크: <http://google.com/>
```
외부링크: <http://google.com/>



### 2.10. 이미지
`<img>` 태그<br>  
```markdown
//문법
![대체 택스트(alternative text)](사진링크 "설명")

혹은

![대체 택스트(alternative text)](참조링크)
[참조링크] : 사진링크 "설명"

//예시
![camping](./camping_1.jpg "halloween camping image")
```
![camping](./camping_1.jpg "halloween camping image")

위 문법은 이미지의 크기 조절 기능은 없다.  
사이즈 조절을 하고자 한다면, `<img width="" height=""></img>`를 사용해야한다.
```markdown
<img src="./camping_1.jpg" width="40%" height="40%" title="10px" alt="halloween camping image"></img>
```
<img src="./camping_1.jpg" width="40%" height="40%" title="10px" alt="halloween camping image"></img>

#### ※ 이미지에 링크 걸기
이미지 코드를 링크 `[Title]` 부분으로 묶어준다.
```markdown
[![camping](./camping_1.jpg)](http://google.com/)
```
[![camping](./camping_1.jpg)](http://google.com/)


### 2.11. 원시 HTML
위에서 보았다 싶히 MarkDown 문법으로 해결이 안되는 부분은 HTML로 해결가능하다.   
이 외에 하고자 하는 것들은 HTML을 사용하자.

## 참고
- https://heropy.blog/2017/09/30/markdown/
- https://gist.github.com/ihoneymon/652be052a0727ad59601#1-%EB%A7%88%ED%81%AC%EB%8B%A4%EC%9A%B4%EC%97%90-%EA%B4%80%ED%95%98%EC%97%AC
- 