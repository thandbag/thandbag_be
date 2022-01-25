## 👊 생드백(Thandbag) - BackEnd
![thandbag_main_thumbnail](https://user-images.githubusercontent.com/87135478/150528634-b8623912-648a-49a9-9a0a-b980a5c45610.png)

<br />

## 🗂 Summary
### 항해99 4기, 실전 프로젝트 7조
> \* 서비스명 : 생드백 (*Think + Sandbag = Thandbag!*)  
> \* 서비스 설명 : 일상 생활속에서 받은 스트레스, 고민을 샌드백을 때리면서 재미있게 풀 수 있는 스트레스 해소 서비스  
    
- [\[사이트 바로가기\]](https://thandbag.com)  
- [\[시연영상 바로가기\]](https://www.youtube.com/watch?v=h1GhBCIiZe0)  

<br />

## 👥 멤버
- Back-end: [고성범](https://github.com/SeongBeomKo), [오규화(조장)](https://github.com/59-devv)
- Front-end: [이준명](https://github.com/Leejunmyung), [전용태](https://github.com/yong313), [정상일](https://github.com/jsni94)
- Design : 정서윤, 황지현
- [\[Front-End Github\]](https://github.com/thandbag/thandbag_FE)

<br />

## 🗓 프로젝트 기간
- 2021년 12월 18일 ~ 2022년 01월 28일
  \- 기획 : 2021년 12월 18일 ~ 12월 21일


<br />


## ♟ Information Architecture
![image](https://user-images.githubusercontent.com/87135478/150537317-d428e046-b7da-4f19-8176-351bd04c1b65.png)

<br />

## 🧩 Architecture
![image](https://user-images.githubusercontent.com/87135478/150536736-dcd94ef7-a88d-4235-81dd-7ce0513b2faf.png)

<br />


## 🗺 ER Diagram
![image](https://user-images.githubusercontent.com/87135478/150534258-326547ce-2094-4b5f-ac83-ee9a9967a58d.png)

<br />

## ⚙️ Back-End 기술 스택

|분류|기술|
| :-: |:- |
|IDE|<img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=for-the-badge&logo=IntelliJ IDEA&logoColor=white">|
|Language|<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white">|
|Framework|<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"> <img src="https://img.shields.io/badge/Springboot-6DB33F?style=for-the-badge&logo=Springboot&logoColor=white">|
|Build Tool|<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">|
|DB|<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">|
|Memory DB|<img src="https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white">|
|Server|<img src="https://img.shields.io/badge/aws-232F3E?style=for-the-badge&logo=AmazonAWS&logoColor=white"> <img src="https://img.shields.io/badge/Amazon S3-569A31?style=for-the-badge&logo=Amazon S3&logoColor=white">|
|CI/CD|<img src="https://img.shields.io/badge/Travis CI-3EAAAF?style=for-the-badge&logo=Travis CI&logoColor=white">|
|Test|<img src="https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=JUnit5&logoColor=white">|
|Load Test|<img src="https://img.shields.io/badge/Apache JMeter-D22128?style=for-the-badge&logo=Apache JMeter&logoColor=white">|
|VCS|<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">|
|Reverse Proxy|<img src="https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=NGINX&logoColor=white">|
|API Document Tool|<img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black">|

<br />

## 📌 API 명세서
- [\[API 명세서 바로가기\]](https://typical-guanaco-54b.notion.site/API-bda198d1807e4eff8de732ebe02f3134)


<br />

## 🤝 Code Convention

> 1. 변수 네이밍 규칙 : ```Camel Case```
> 2. 한 줄의 글자 수 : ```최대 80자```
> 3. 한 줄 주석 표기 : ```/*  */```
> 4. 여러 줄 주석 표기 : 
> ```java
>   /*-
>    *
>    *
>    */
> ```
> 5. 삼항연산자 표기 : 
> ```
>   alpha = (BooleanExpression) ? beta
>                               : gamma
> ```
> 6. If문에서 &&, ||' 표기
> ```
>   if((condition1 && condition2)
>     || (condition3 && condition4) 
>     || (condition5 && condition6) {
>     do something();
>   }
> ```


<br />

## 👀 유저 피드백  
>  \* 피드백 수집일자 : 2022년 1월 22일 ~ 2022년 1월 25일  
>  \* 피드백 수 : 총 27개  
* 서비스 만족도 평균 점수 : 4.4점 (5점)  
* 스트레스 해소 만족도 점수 : 4.2점 (5점)  
* 긍정적인 피드백 Top3  
    * 생드백을 때리면서 스트레스를 해소한다는 아이디어가 참신하고 좋았다.  
    * 생드백을 때릴 때, 생드백이 맞는 모션과 함께 타격감이 있어서 재미있었다.  
    * 간단하게 이용할 수 있고 인터페이스가 익숙하면서 편하다.  
* 개선에 대한 피드백 Top3  
    * 일부 페이지에서 하단 네비게이션 바가 보여지지 않아 불편했다. (네비게이션 바를 모든 페이지에서 볼 수 있도록 개선 완료)  
    * 채팅을 어떨 때 이용할 수 있는지 모르겠다. (채팅 메뉴에서 이용안내 가이드를 볼 수 있도록 개선 완료)  
    * 첫 화면이 로그인이라서, 로그인을 하지 않으면 아무것도 할 수 없다. (게시글 조회는 로그인을 하지 않아도 되도록 개선 완료)  

<br />

## 👣 런칭 성과
>  \* 런칭일자 : 2022년 01월 22일(토)  
>  \* 성과 집계일자 : 2022년 01월 25일(화) 16:00

### 1. 인스타그램 광고 진행 성과 요약
* 3일간 인스타그램 광고 진행을 통해 약 2만명에게 도달하였으며 이 중, 182명이 사이트에 방문하였음  
* 방문자 중 약 67%는 여성이었음  
* 방문자 중 약 91%는 13-17세의 연령층이었음  
![image](https://user-images.githubusercontent.com/87135478/150996596-5a31264d-0eef-4ad4-8d77-9170158c42ea.png)

<br />

### 2. 개발자 커뮤니티/포럼 홍보 성과 요약
* Okky, 뽐뿌 개발자포럼을 통해 서비스 홍보를 진행하였음
* 사용자, 세션수 등에서 인스타그램 광고를 통한 성과 지표보다 높은 성과를 얻었음
![image](https://user-images.githubusercontent.com/87135478/150999046-b5c3e854-37fe-4dfa-b2c9-20cce48e975d.png)


<br />

### 3. 런칭 이후 누적 데이터 분석
* 가입 회원 수 : 105명
* 작성된 생드백(게시글) 수 : 총 46개 
* 터트린 생드백 수 : 17개 (전체 대비 37%)
* 작성된 잽(댓글) 수 : 총 75개
* 가장 많은 생드백이 작성된 고민 카테고리 Top2 : 기타(25개), 대인관계(11개)
* 기간동안 생드백이 맞은 횟수 : 총 4,869대 (1인 평균 46.3대)


<br />

## ⛔️ Trouble Shooting

```
1. 전체DB 조회 시, 반환 속도가 느린 문제 
```
>
> 🛠 해결방법 : DB 인덱싱을 통한 data 반환 속도 향상 (초당 122개 반환 -> 초당 486개 반환)  
>
> ❗️ 코드  
> <img src=https://user-images.githubusercontent.com/87135478/150985188-6b64bf0b-454d-4cd8-9750-f9fb7b119f2a.png width="500" height="70">  
>  
> ❓ As-Is (Throughput : 122.4/sec)  
> <img src=https://user-images.githubusercontent.com/87135478/150985231-af835a6c-2594-435f-84ca-57b2fa5b94ea.png width="800" height="130">  
>   
> 💡 To-Be (Throughput : 485.9/sec)  
> <img src=https://user-images.githubusercontent.com/87135478/150985255-34abe50e-7919-4a29-b61d-6504590f2081.png width="800" height="130">  

<br/>
<br />

```
2. JPA에서 데이터 조회 시 발생하는 n+1 문제
```
> 
> ❗️ 문제 : JPA를 통해 데이터를 조회할 경우, 연관관계가 있는 데이터들을 추가로 조회하도록 쿼리를 보내는 n+1 문제가 발생함
>
> ❓ As-Is  
> <img src=https://user-images.githubusercontent.com/87135478/150987705-9227882e-2592-4985-a58c-e59d5e1d6392.png width="800">
> 
> 💡 To-Be  
> <img src=https://user-images.githubusercontent.com/87135478/150987733-7e63ef58-8b76-417d-99c8-375256813124.png width="800">

<br />
<br />

```
3. 테스트코드 실행 시, 실제 DB로 테스트를 진행하는 문제
```
> 
> ❗️ 문제 : 실제로 사용하는 DB를 테스트에서도 사용할 경우, 데이터에 영향을 미칠 수 있기 때문에 Memory DB에서 테스트를 진행하여야 함
>
> 💡 To-Be (SpringBootTest 진행 시 Test 패키지의 application.properties에, 메모리DB 사용 설정)  
> <img src=https://user-images.githubusercontent.com/87135478/150990025-68a85892-2353-4dfa-ae71-52f1dc2c3aaa.png width="300">
>
> 💡 To-Be (RepositoryTest 진행 시, @DataJpaTest 어노테이션을 활용하여 메모리DB 환경에서 JPA 관련 Bean들만 주입받아 테스트)  
> <img src=https://user-images.githubusercontent.com/87135478/150990293-40a70e01-7cf4-4a05-83c3-643f2777d2c6.png>

<br />
<br />

```
4. 파일 업로드 시, 1mb 이상의 파일이 업로드 되지 않는 문제 (NginX)
```
> 
> ❗️ 문제 : 1mb 미만의 파일은 정상적으로 업로드 되지만, 1mb 이상은 업로드 되지 않음
>
> ❓ 원인 : NginX에서 파일업로드 용량을 1mb로 제한해두었음 (기본 설정)  
>
> 💡 To-Be (nginx.conf 파일 수정을 통한 업로드 제한 용량 변경)  
> <img src=https://user-images.githubusercontent.com/87135478/150990790-849479ae-97e5-45db-83ae-3ec8e5f49e63.png>

<br />
<br />

```
5. 제목, 내용 등에 긴 글 작성이 되지 않을 경우
```
> 
> ❓ 원인 : MySql에서 Data Type이 VARCHAR()로 되어 있어서, 글자수 제한이 존재하였음
>
> 💡 To-Be (LONGTEXT() 타입으로 변경하여 해결)  
> <img src=https://user-images.githubusercontent.com/87135478/150993226-1f9e3a46-967b-4d29-9b13-7081612b2f42.png>

<br />
<br />

```
6. Travis CI 를 통한 배포자동화 진행 시, properties 파일의 보안 처리 문제
```
> 
> ❓ 원인 : properties 파일의 설정값을 읽어와야 하기 때문에, .gitignore에 추가하면 설정을 읽을 수 없어 빌드를 실패함
>
> 💡 To-Be (암호화를 한 후 Travis CI에서 배포 시 복호화 할 수 있도록 설정)  
> ```
> travis encrypt-file application.properties --add
> ```
> ![image](https://user-images.githubusercontent.com/87135478/150993869-45b61130-78aa-4119-887e-ca19b753f13b.png)

<br />
<br />

```
7. 게시글, 채팅의 시간이 한국 시간과 9시간 차이가 나는 문제
```
> 
> ❓ 원인 : EC2, RDS의 시간 기본값이 UTC(협정세계시)으로 설정되어있기 때문
>
> 💡 To-Be (EC2 시간대 변경)   
> ```
> # EC2 시간대 변경
> sudo rm /etc/localtime
> sudo ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime
> ```
>
> 💡 To-Be (RDS 시간대 변경)   
> ![image](https://user-images.githubusercontent.com/87135478/150994438-751f9f57-b2c8-44a1-a50f-cbc87531d1b1.png)


