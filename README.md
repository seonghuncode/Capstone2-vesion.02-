# Capstone2-vesion.02- (4학년 2학기 졸업작품)
캡스톤2 템플릿 사용

<br>
캡스톤디자인 팀별 결과보고서
학년도 학기	2023년도 1학기
팀 명	웹 서버 구축	결과물 형태	소스코드
수행 과제명	실무에서 자주 사용되는 기술들을 이용한 웹 서버 구축
주제: 동아리 홈페이지



<h2 tabindex="-1" dir="auto"><a id="user-content--웹-서비스-소개" class="anchor" aria-hidden="true" tabindex="-1" href="#-웹-서비스-소개"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a>🗒️ 목차</h2>
Ⅰ. 과제 선택<br>
Ⅱ. 과제 수행 과정 및 내용<br>
Ⅲ. 도출 결과 내용<br>



<h2 tabindex="-1" dir="auto"><a id="user-content--웹-서비스-소개" class="anchor" aria-hidden="true" tabindex="-1" href="#-웹-서비스-소개"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a>Ⅰ. 과제 선택</h2>
<p>1. 수행 과제명</p>
<pre>
: ‘실무에서 자주 사용되는 기술들을 활용한 웹 서버 구축’
</pre>
<p>2. 과제 수행 목적 <br>
<pre>
저희는 실무에서 널리 사용되는 기술들을 활용하여 웹 서버를 구축함으로써, 실제 업무 환경에서 필요한 기술들을 익히고, 이를 통해 현업에서 요구되는 실무 능력을 갖추고자 합니다. 
실무에서 널리 사용되는 Spring과 Laravel Framework를 사용함으로써, 실제 개발 환경에 적응하고 프로젝트를 효율적으로 구축하는 방법을 익힐 수 있습니다. 
또한, Docker와 AWS를 활용한 배포와 인프라 관리, 토큰을 사용한 보안 등 실무에 필수적인 기술들을 학습하면서, 프로젝트의 전체적인 흐름과 아키텍처에 대한 이해를 높일 수 있습니다.
</pre>
</p>
<p>
3.	 홈페이지 주제<br>
 <pre>
 3-1. 주제 : ‘동아리 홈페이지 구축’ <br>
 3-2. 동아리 홈페이지가 필요한 이유 <br>
      동아리를 오프라인으로만 운영할 경우, 동아리 일정 및 공지사항 등을 전달하는 수단이 제한됩니다. 또한, 회원들 사이의 소통과 조율을 위한 커뮤니케이션 경로가 제한되기도 합니다. 그로 인해 동아리에 대한 구성원들의 관심과 참여도가 낮아  
      질 수 있습니다. 
      또한, 새로운 멤버 모집에도 어려움을 겪을 수 있습니다. 동아리의 가치와 활동에 대한 상세한 정보를 제공할 수 있는 매체의 부족으로 동아리에 대한 인식을 높이는 것이 어려워질 수 있습니다.
      동아리 홈페이지의 존재는 이러한 애로사항들을 해결함과 동시에, 회원들의 공동체 의식을 형성하고, 동아리를 보다 효율적으로 운영하도록 도와줍니다.<br>
 3-3. 동아리 홈페이지 구축으로 인한 장점 및 효과<br>
      - 커뮤니케이션 강화<br>
        동아리 웹 페이지를 통해 동아리 회원들과의 소통이 원할해지며, 
        : 새로운 아이디어나 의견을 공유하고 협업할 수 있습니다.<br>
      - 일정 및 공지사항 관리<br>
        : 활동 일정, 회의 및 이벤트 공지사항을 효율적으로 관리하고 공유할 수 있습니다.<br>
      - 멤버 모집 효과<br>
        : 동아리의 목표와 가치를 효율적으로 전달하고, 홈페이지를 통해 동아리에 대한 자세한 정보를 제곰함으로써 새로운 회원 모집에 도움을 줍니다.<br>
      -브랜딩과 이미지 강화<br>
        : 동아리 웹 페이지를 통해 동아리가 진행한 프로젝트나 활동 내용을 시각적으로 보여줌으로써 동아리의 이미지를 강화할 수 있습니다.
  </pre>
</p>


<h2 tabindex="-1" dir="auto"><a id="user-content--웹-서비스-소개" class="anchor" aria-hidden="true" tabindex="-1" href="#-웹-서비스-소개"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a>Ⅱ. 과제 수행 과정 및 내용<br></h2>
- 프로젝트 진행 일정표
<table>
<thead>
<tr>
<th align="left">주차</th>
<th align="left">활동 내용</th>
</tr>
</thead>
<tbody>
<tr>
<td align="left">1</td>
<td align="left">프로젝트 주제 선정 및 구현할 웹 페이지 후보 도출</td>
</tr>
 <tr>
<td align="left">2</td>
<td align="left">
1명씩 각 후보 주제를 맡아 구체화 후, 회의 진행<br>
최종 주제 선정: ‘동아리 홈페이지’
</td>
</tr>
  <tr>
<td align="left">3</td>
<td align="left">
[프론트앤드]<br>
- 영역별 기능 세분화<br>
[백엔드]<br>
- MacOS, Windows에 Laravel 환경 설치 및 백엔드 기능 구상
</td>
</tr>
  <tr>
<td align="left">4</td>
<td align="left">
개발환경 회의 및 선정<br>
[프론트엔드]<br>
- 프레임워크: SpringBoot<Br>
- IDE: Intellij<br>
- 뷰템플릿: thymeleaf<br>
[백엔드]<br>
- 프레임워크: Laravel<br>
- IDE: VS Code<br>
- 서버: AWS (ec2)
</td>
</tr>
  <tr>
<td align="left">5</td>
<td align="left">
개발 환경 구축<br>
[프론트엔드]<br>
- Intellij, Git 설치<br>
- SpringBoot 프로젝트 생성<br>
- 뷰템플릿: thymeleaf<br>
- 개발에 필요한 의존성 주입<br>
- 포트 및 기타 경로 설정(application.yml)<br>
- 프로젝트 구조 잡기 (MVC 모델)<br>
[백엔드]<br>
- Laravel에 pgsql, redis 연결<br>
- MacOS와 Windows에 php 및 Laravel 환경 구축<br>
- Docker 환경 구성 및 pgsql, redis 등 컨테이너 이미지 생성<br>
- VS Code에 개발에 필요한 확장 라이브러리 설치
</td>
</tr>
  <tr>
<td align="left">6</td>
<td align="left">
[프론트엔드]<br>
- 전체 페이지에 필요한 공통 템플릿 개별 생성<br>
: 네비개이션바<br>
[백엔드]<br>
- 프론트엔드에서 요청한 API 작성 <br>
</td>
</tr>
   <tr>
<td align="left">7</td>
<td align="left">
[프론트엔드]<br>
- 전체 페이지에 필요한 공통 템플릿 개별 생성<br>
: 메뉴 탭<br>
[백엔드]<br>
- 프론트엔드에서 요청한 API 작성<br>
- 옵저버 부착
</td>
</tr>
    <tr>
<td align="left">8</td>
<td align="left">
[프론트엔드]<br>
- 메인 페이지 레이아웃 잡기 및 디자인<br>
[백엔드]<br>
- 프론트엔드에서 요청한 API 작성<br>
</td>
</tr>
    <tr>
<td align="left">9</td>
<td align="left">
[프론트엔드]<br>
- 공지 페이지 레이아웃 설계 및 디자인<br>
[백엔드]<br>
- 프론트엔드에서 요청한 API 작성
</td>
</tr>
    <tr>
<td align="left">10</td>
<td align="left">
- 기본 사용자 인증 시스템 구축<br>
(로그인, 로그아웃, 비밀번호 재설정)<br>
- 사용자 및 세션에 대한 데이터베이스 스키마 설정<br>
- 인증 시스템에 대한 단위 테스트 진행
</td>
</tr>
    <tr>
<td align="left">11</td>
<td align="left">
- 회원가입 기능 구현<br>
- 등록 양식에 양식 유효성 검사 및 오류 처리 추가<br>
- 등록 기능에 대한 단위 테스트 진행
</td>
</tr>
    <tr>
<td align="left">12</td>
<td align="left">
- 게시판의 CRUD(생성, 읽기, 업데이트, 삭제) 기능 구축<br>
- 게시판 페이지 번호 및 정렬 구현<br>
- 게시판 기능에 대한 단위 테스트 진행
</td>
</tr>
    <tr>
<td align="left">13</td>
<td align="left">
- 게시판 댓글 기능 개발<br>
- 중첩 댓글 및 답글 기능 구현<br>
- 주석 기능에 대한 단위 테스트 진행
</td>
</tr>
    <tr>
<td align="left">14</td>
<td align="left">
- 알림 기능에 대한 CRUD 구현<br>
- 알림 기능에 대한 단위 테스트 진행
</td>
</tr>
    <tr>
<td align="left">15</td>
<td align="left">
- 다양한 사용자 역할(관리자, 중재자, 일반 사용자) 부여 기능 개발<br>
- 각 역할에 대한 권한 및 액세스 수준 정의<br>
- 인증 기능에 대해 단위 테스트 진행<br>
- 프로필 및 설정에 액세스할 수 있는 사용자 대시보드 구축<br>
- 프로필 편집 및 비밀번호 변경 기능 구현<br>
- 사용자 대시보드에 대한 단위 테스트 진행<br>
- 전체 웹 애플리케이션의 전반적인 테스트 및 디버깅
</td>
</tr>
</tbody>
</table>


<table>
<thead>
<tr>
<th align="center">일정</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/b8d7725b-2d54-4c7f-8f0f-1adaf89eacd8" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>

<div>
 <h4>사용된 기술 스택 소개</h4>
 <pre>
  1.	프론트엔드 기술 스택  
 <br>
  
  >	Intellij
  - 프론트엔드 및 백엔드 개발에 널리 사용되는 통합 개발 환경(IDE) 입니다.
  - 사용자 친화적인 인터페이스를 제공하며, 코드 완성, 자동 포맷팅, 실시간 오류 검사 등의
  기능을 통해, 보다 효율적으로 코드를 작성할 수 있도록 도와줍니다.
  - 특정 프레임워크나 라이브러리에 특화된 플러그인을 사용하여 생산성을 높일 수 있습니다. 
  - Git, SVN 등의 버전 관리 시스템을 통합하여 사용할 수 있어, 버전 관리 및 협업 작업을
  원할하게 수행하도록 도와줍니다.

  2.	백엔드 기술 스택

   >	Spring Boot Framework

  - Java 기반의 웹 애플리케이션 개발을 위한 프레임워크입니다.
  - Spring Boot의 자동 설정 기능으로 복잡한 환경 설정에 대한 개발자의 부담을 덜여줍니다.
  - 강력한 의존성 주입(DI) 기능으로 객체 간의 결합도를 낮추고 유연성과 재사용성을
  향상시킬 수 있습니다.
  - 다양한 오픈 소스 라이브러리, 플러그인, 문서, 튜토리얼 등이 존재하여 
  프로젝트 진행 시 발생한 문제점을 빠르게 해결할 수 있습니다.

  >	Laravel Framework
 - PHP 기반 웹 애플리케이션 개발을 위한 프레임워크로, 라우팅을 쉽게 정의하고 관리할 수 
  있으며, MVC 패턴을 사용하여 비즈니스 로직과 뷰를 분리하여 개발할 수 있습니다.
 - Eloquent ORM을 통해 DB와의 상호작용을 쉽게 처리할 수 있으며, 
  SQL쿼리를 직접 작성하지 않고도 객체지향적인 방식으로 데이터를 다룰 수 있습니다.
 - 마이그레이션(Migration) 기능을 통해, DB 스키마를 정의하고, 데이터를 생성, 수정,
  삭제할 수 있습니다. 또한, 시딩(Seeding)을 통해 초기 데이터를 쉽게 삽입할 수 있습니다.

  >	Docker 및 Docker Sail
 - Docker는 애플리케이션을 컨테이너화하여 배포 및 관리하는 컨테이너 플랫폼으로, 
   애플리케이션을 실행하는 환경을 동일하게 유지하여 개발 환경과 운영 환경 사이의 
   일관성을 유지할 수 있습니다.
 - Docker Sail은 Laravel 개발자들을 위한 Docker 개발환경으로 Laravel 프로젝트의 개발 및 배포를 더욱 편리하게 할 수 있도록 도와줍니다.
 - 프로젝트를 간단하게 배포할 수 있습니다. Docker 이미지를 사용하여 애플리케이션을 패키징하고, 필요한 환경에서 실행할 수 있습니다. 또한, 배포 과정에서 발생할 수 있는 호환성 문제를 최소화하고, 애플리케이션의 배포 속도를 향상시킬 수 있    습니다.
   
  > Sail

  Sail은 널리 사용되는 PHP 웹 애플리케이션 프레임워크인 Laravel에서 제공하는 경량 명령줄 인터페이스(CLI) 도구입니다. Sail은 Docker 컨테이너를 사용하여 Laravel 애플리케이션을 실행하기 위한 설정 및 구성 프로세스를 단순화합니다. 개발 환경에서 Laravel 애플리케이션을 관리하고 배포하는 편리한 방법을 제공합니다.
  Sail을 사용하여 개발자는 Laravel 애플리케이션을 실행하는 데 필요한 모든 필수 종속성 및 서비스로 개발 환경을 쉽게 설정할 수 있습니다. Sail은 Docker를 활용하여 PHP, Nginx, MySQL, Redis 등과 같은 서비스를 위한 격리된 컨테이너를 생성합니다. 이러한 서비스를 개별적으로 구성하고 관리하는 복잡성을 추상화하여 개발자가 애플리케이션 코딩 및 테스트에 더 쉽게 집중할 수 있도록 합니다.
  Sail은 Laravel 애플리케이션용으로 특별히 설계된 사전 빌드된 Docker Compose 파일을 제공합니다. 이 Compose 파일은 애플리케이션을 실행하는 데 필요한 서비스, 네트워크 구성 및 볼륨을 정의합니다. 개발자는 추가 서비스 추가 또는 기존 서비스 수정과 같은 프로젝트 요구 사항에 따라 Compose 파일을 사용자 지정할 수 있습니다.
  Sail을 사용하는 방법은 간단합니다. 시스템에 Docker를 설치한 후 단일 명령을 실행하여 Laravel 프로젝트에서 Saile을 초기화할 수 있습니다. 이 명령은 Docker Compose 파일과 Laravel 애플리케이션에 특정한 Dockerfile을 포함하여 필요한 Docker 구성 파일을 생성합니다.
  Sail이 설정되면 다양한 명령을 사용하여 Laravel 애플리케이션 및 기본 Docker 컨테이너와 상호 작용할 수 있습니다. 예를 들어 개발 환경을 시작하고, 데이터베이스 마이그레이션을 실행하고, PHPUnit 테스트를 실행하고, 애플리케이션 셸에 액세스하거나 Composer 종속성을 설치할 수 있습니다. Sail은 Docker 관련 명령을 추상화하고 개발 환경 관리를 위한 일관된 Laravel 관련 인터페이스를 제공합니다.
  Sail은 설치 용이성, 재현성 및 격리를 포함하여 Docker의 이점을 Laravel 개발에 제공합니다. 이를 통해 개발자는 서로 다른 프로젝트 간에 빠르게 전환할 수 있으며 팀 구성원 간에 일관된 환경을 보장할 수 있습니다. Sail을 활용함으로써 개발자는 기본 인프라 관리의 복잡성에 대해 걱정하지 않고 Laravel 애플리케이션을 구축하고 테스트하는 데 집중할 수 있습니다.

 >	AWS

 - 클라우드 컴퓨팅 기반 서비스로서 서버 구축, 데이터베이스 관리 등을 위해 사용됩니다.
 - 필요에 따라 리소스를 신속하게 확장하거나 축소할 수 있기 때문에, 소규모 프로젝트에서도
   적은 비용과 노력으로 필요한 인프라를 유연하게 조정할 수 있는 장점이 있습니다. 또한,
   필요한 만큼만 사용하고 지불하는 Pay-as-you-go 방식이므로, 예산 관리 측면에 유용합니다.
 - AWS는 글로벌 인프라를 보유하고 있어, 강력한 가용성과 안정성이 제공됩니다. 이로 인해, 
   소규모 프로젝트에서도 AWS의 다양한 서비스를 통해 고가용성 아키텍처를 구성할 수 있고
   장애 발생 시에도 서비스의 지속적인 가용성을 보장할 수 있습니다.
  
  >	AWS EC2

  AWS EC2(Elastic Compute Cloud)는 클라우드에서 가상 서버를 시작하고 관리할 수 있도록 Amazon Web Services(AWS)에서 제공하는 웹 서비스입니다. 확장 가능한 컴퓨팅 리소스를 제공하여 애플리케이션 요구 사항에 따라 가상 머신 인스턴스를  
  신 속하게 프로비저닝하고 구성할 수 있습니다. EC2는 다양한 기능을 제공하므로 많은 클라우드 기반 애플리케이션의 기본 빌딩 블록이 됩니다.
  다음은 AWS EC2의 주요 측면과 기능입니다.
   1.	가상 서버 인스턴스: EC2를 사용하면 다양한 구성으로 EC2 인스턴스로 알려진 가상 서버 인스턴스를 생성할 수 있습니다. CPU, 메모리, 스토리지 및 네트워크 성능과 같은 요소를 기반으로 인스턴스 유형을 선택할 수 있습니다. EC2는 범용 컴퓨      팅, 메모리 집약적 애플리케이션, GPU 기반 처리 및 고성능 네트워킹과 같은 다양한 워크로드에 최적화된 광범위한 인스턴스 유형을 지원합니다.
   2.	확장성: EC2를 사용하면 수요에 따라 컴퓨팅 용량을 확장할 수 있습니다. 사전 정의된 조정 정책 및 지표에 따라 인스턴스 수를 자동으로 조정하는 Auto Scaling을 사용하거나 수동으로 필요에 따라 인스턴스 수를 늘리거나 줄일 수 있습니다. 이러한 탄력성을 통해 트래픽 급증을 처리하고 리소스 활용도를 효율적으로 관리할 수 있습니다.
   3.	스토리지 옵션: EC2는 다양한 사용 사례에 적합한 다양한 스토리지 옵션을 제공합니다. 여기에는 다음이 포함됩니다.
      o	인스턴스 스토어: EC2 인스턴스에 물리적으로 연결된 임시 스토리지. 지연 시간이 짧은 고성능 스토리지를 제공하지만 일시적이며 인스턴스가 중지되거나 종료되면 손실됩니다.
      o	Amazon EBS(Elastic Block Store): EC2 인스턴스에 연결할 수 있는 영구 블록 수준 스토리지입니다. EBS 볼륨은 EC2 인스턴스와 독립적이며 다른 인스턴스에 분리했다가 다시 연결할 수 있습니다.
      o	Amazon S3(Simple Storage Service): EC2 인스턴스는 S3와 상호 작용하여 데이터를 저장하고 검색할 수 있습니다. S3는 파일, 문서 및 기타 구조화되지 않은 데이터를 저장하기 위한 확장성과 내구성이 뛰어난 객체 스토리지를 제공합니다.
   4.	네트워킹: EC2 인스턴스는 AWS 클라우드의 논리적으로 격리된 섹션인 Virtual Private Cloud(VPC) 내에서 시작됩니다. VPC를 사용하면 IP 주소 범위, 서브넷, 라우팅 테이블 및 네트워크 게이트웨이를 포함하여 EC2 인스턴스의 네트워킹 환경을 정의하고 제어할 수 있습니다. EC2 인스턴스에 퍼블릭 또는 프라이빗 IP 주소를 할당할 수 있으며 보안 그룹 및 네트워크 ACL(액세스 제어 목록)을 구성하여 인바운드 및 아웃바운드 트래픽을 제어할 수 있습니다.
   5.	보안: EC2는 인스턴스와 데이터를 보호하기 위해 다양한 보안 기능을 제공합니다. 여기에는 다음이 포함됩니다.
      o	보안 그룹: 인스턴스 수준에서 EC2 인스턴스에 대한 인바운드 및 아웃바운드 트래픽을 제어하는 가상 방화벽.
      o	네트워크 액세스 제어 목록(ACL): 서브넷 수준에서 트래픽을 제어하는 상태 비저장 규칙 기반 필터입니다.
      o	키 쌍: EC2는 Linux 인스턴스에 대한 보안 SSH(Secure Shell) 액세스 및 Windows 인스턴스에 대한 RDP(원격 데스크톱 프로토콜) 액세스에 키 쌍을 사용합니다.
      o	IAM(Identity and Access Management): IAM을 사용하면 특정 권한이 있는 사용자, 그룹 및 역할을 생성하여 EC2 인스턴스를 비롯한 AWS 리소스에 대한 액세스를 관리할 수 있습니다.
   6.	AMI(Amazon 머신 이미지): AMI는 필수 운영 체제, 소프트웨어 및 EC2 인스턴스를 시작하는 데 필요한 구성이 포함된 사전 구성된 템플릿입니다. AWS는 다양한 Linux 배포판, Windows Server, 특정 애플리케이션 및 사용 사례에 최적화된 특수 AMI를 포함하여 다양한 사전 구축 AMI를 제공합니다. 특정 요구 사항에 따라 사용자 지정 AMI를 생성할 수도 있습니다.
   7.	모니터링 및 관리: EC2는 다음을 포함하여 인스턴스 모니터링 및 관리를 위한 여러 도구를 제공합니다.
      o	Amazon CloudWatch: EC2 인스턴스에서 지표, 로그 및 이벤트를 수집하고 추적하는 모니터링 서비스입니다. 이를 통해 경보를 설정하고, 리소스 사용률을 모니터링하고, 인스턴스 성능에 대한 통찰력을 얻을 수 있습니다.
      o	AWS Systems Manager: 여러 EC2 인스턴스에서 작업 자동화, 패치 관리, 운영 체제 구성, 관리 작업 수행을 지원하는 관리 서비스입니다.
   8.	통합 및 서비스: EC2는 다른 AWS 서비스와 원활하게 통합되므로 확장 가능하고 포괄적인 솔루션을 구축할 수 있습니다. 몇 가지 예로는 트래픽 분산을 위한 Elastic Load Balancing, 관리형 관계형 데이터베이스를 위한 Amazon RDS, 서버리스 컴퓨팅을 위한 AWS Lambda, 단순화된 애플리케이션 배포를 위한 AWS Elastic Beanstalk와의 통합이 있습니다.
   AWS EC2는 클라우드에서 다양한 워크로드를 실행하기 위한 유연하고 확장 가능한 인프라를 제공합니다. 이를 통해 가상 서버 인스턴스를 완벽하게 제어할 수 있으며 스토리지, 네트워킹, 보안 및 관리를 위한 다양한 옵션을 제공합니다. EC2의 종량제 요금 모델은 사용한 리소스에 대해서만 요금을 지불하므로 비용 효율성을 보장합니다. 안정성, 확장성 및 광범위한 기능 세트로 인해 신생 기업에서 대기업에 이르기까지 모든 규모의 비즈니스에서 인기 있는 선택이 되었습니다.
   
 >	PostgreSQL

 - 오픈 소스 관계형 데이터베이스 관리 시스템(RDBMS)으로, 고급 SQL 기능을 제공하며,
풍부한 데이터 유형과 복잡한 쿼리가 지원됩니다.
- JSON 데이터 형식과 공간 데이터 타입 등 다양한 확장 기능을 포함하고 있어 
다양한 데이터 모델링 요구 사항을 충족시킬 수 있습니다.
- ACID (원자성, 일관성, 고립성, 지속성) 트랜잭션을 지원하여 데이터의 무결성을 보장하며,
  다양한 보안 기능과 접근 제어, 암호화, SSL/TLS 연결 등의 기능을 통해, DB의 안정성 및 
  데이터의 기밀성과 무결성을 강화할 수 있습니다.
- 활발한 커뮤니티와 지원을 통해 다양한 문서, 튜토리얼, 예제 코드 등을 쉽게 찾을 수 있습니다.
- 이러한 장점들로 인해, PostgreSQL은 백엔드 개발에서 안정성, 확장성, 성능 및 데이터 보안 측면의 요구 사항을 충족시킬 수 있는 강력한 선택지가 될 수 있습니다.

> 토큰

- 토큰을 사용하여 사용자의 신원을 증명 및 인증하고, 사용자에 대한 권한을 
  부여할 수 있습니다. 또한, 암호화된 정보를 전달하고, 중요한 데이터를 보호할 수 있습니다.
  - 토큰 기반 인증은 세션 관리 없이도, 다양한 플랫폼 및 디바이스에서 사용자 경험을 
  향상시킵니다. 사용자는 토큰을 통해 로그인한 뒤, 지속적인 인증 없이 서비스를 이용할 
  수 있습니다. 

> VS Code
- 경량 코드 편집기로, 백엔드 개발에 많이 사용되는 강력한 도구입니다.
- 사용자 친화적인 인터페이스와 직관적인 단축키로, 개발자들이 빠르게 익힐 수 있고, 
  자신만의 단축키도 쉽게 설정할 수 있습니다.
- 풍부한 확장 기능으로 필요한 기능을 쉽게 추가할 수 있고, 프로젝트에 맞게 환경을 
  구성할 수 있어, 개발 생산성을 높이도록 도와줍니다.
- Git 등의 버전 관리 시스템을 통합하여 사용할 수 있고, 변경 사항의 추적, 병합, 커밋 
  등을 간편하게 수행할 수 있으며, 협업 작업을 원활하게 진행할 수 있습니다.


3.	공통 기술 사용

   >	Table Plus

   TablePlus는 사용자 친화적이고 효율적인 방식으로 다양한 데이터베이스와 상호 작용할 수 있는 현대적이고 직관적인 데이터베이스 관리 도구입니다. 데이터베이스 관리 작업을 간소화하고 생산성을 향상시키도록 설계되었습니다. 다음은 TablePlus    의 주요 특징 및 기능입니다.
    1.	크로스 플랫폼 호환성: TablePlus는 macOS, Windows 및 Linux 운영 체제에서 사용할 수 있으므로 다양한 사용자가 액세스할 수 있습니다.
    2.	여러 데이터베이스 지원: TablePlus는 MySQL, PostgreSQL, SQLite, Microsoft SQL Server, MongoDB 등과 같은 널리 사용되는 데이터베이스를 포함하여 다양한 데이터베이스를 지원합니다. 이를 통해 단일 애플리케이션 내에서 동시에 여러 데이터베이스로 작업할 수 있습니다.
    3.	직관적인 사용자 인터페이스: TablePlus의 사용자 인터페이스는 깔끔하고 직관적이며 쉽게 탐색할 수 있도록 설계되었습니다. 데이터베이스, 테이블 및 쿼리 결과의 구조화된 보기를 제공하므로 데이터를 편리하게 관리하고 시각화할 수 있습니다.
    4.	고급 쿼리 편집기: TablePlus는 SQL과 같은 다양한 데이터베이스 쿼리 언어에 대한 구문 강조, 코드 완성 및 서식을 지원하는 강력한 쿼리 편집기를 제공합니다. 복잡한 쿼리를 작성하고 실행하기 위한 원활한 환경을 제공합니다.
    5.	데이터 편집 및 가져오기/내보내기: TablePlus를 사용하면 응용 프로그램 내에서 직접 테이블 데이터를 편집할 수 있으므로 추가 도구 없이 레코드를 편리하게 수정할 수 있습니다. 또한 다양한 형식으로 데이터 가져오기 및 내보내기를 지원하여 데이터 마이그레이션 및 공유를 용이하게 합니다.
    6.	SSH 및 SSL/TLS 지원: TablePlus는 SSH 터널링 및 SSL/TLS 암호화를 지원하여 데이터베이스에 대한 보안 연결을 제공합니다. 이렇게 하면 데이터가 네트워크를 통해 안전하게 전송됩니다.
    7.	데이터베이스 구조 탐색: 테이블, 열, 인덱스 및 관계를 포함하여 데이터베이스 구조를 쉽게 탐색할 수 있습니다. TablePlus는 데이터베이스 스키마를 시각적으로 표현하여 데이터베이스 구조를 한 눈에 이해할 수 있도록 합니다.
    8.	협업 및 팀워크: TablePlus는 여러 사용자가 동일한 데이터베이스에서 동시에 작업할 수 있는 협업 기능을 제공합니다. 실시간 협업을 지원하여 팀원이 실시간으로 변경하고 업데이트를 볼 수 있습니다.
    9.	사용자 지정 및 확장: TablePlus는 다양한 사용자 지정 옵션을 제공하여 사용자의 기본 설정에 따라 인터페이스를 개인화할 수 있습니다. 또한 플러그인과 애드온을 통해 애플리케이션의 기능을 확장할 수 있는 확장 기능도 지원합니다.
    10.	정기 업데이트 및 지원: TablePlus는 최신 데이터베이스 버전과의 호환성을 보장하고 보고된 문제를 해결하기 위해 적극적으로 개발되고 정기적으로 업데이트됩니다. 또한 사용자의 문의 및 기술적인 어려움을 돕기 위해 신속한 고객 지원을 제공합니다.
 요약하면 TablePlus는 데이터베이스와의 상호 작용을 단순화하는 다재다능하고 사용자 친화적인 데이터베이스 관리 도구입니다. 생산성을 향상시키는 다양한 특징과 기능을 제공하므로 데이터베이스 관리자, 개발자 및 데이터베이스 작업을 하는 모든 사람에게 귀중한 자산이 됩니다.

 > PostMan
 Postman은 웹 API(애플리케이션 프로그래밍 인터페이스)를 테스트, 문서화 및 상호 작용하기 위해 개발자가 사용하는 인기 있는 공동 작업 플랫폼 및 도구입니다. 개발자가 HTTP 요청을 보내고, 응답을 분석하고, API 워크플로를 효율적으로 관리할 수 있는 사용자 친화적인 인터페이스를 제공합니다. Postman은 API 개발 프로세스를 간소화하는 다양한 기능을 제공합니다. 다음은 Postman의 몇 가지 주요 측면입니다.
 1.	API 요청 작성: Postman을 사용하면 다양한 HTTP 메서드(GET, POST, PUT, DELETE 등)를 사용하여 HTTP 요청을 생성하고 API에 보낼 수 있습니다. 요청 헤더, 매개 변수, 인증 세부 정보 및 요청 본문을 지정하여 API와 상호 작용하고 다양한 시나리오를 테스트할 수 있습니다.
 2.	요청 구성: Postman은 API 요청을 컬렉션으로 구성하고 그룹화하는 편리한 방법을 제공합니다. 컬렉션은 관련 요청을 분류하고 관리하는 데 도움이 되므로 필요에 따라 특정 요청을 더 쉽게 탐색하고 실행할 수 있습니다.
 3.	환경 변수: Postman을 사용하면 API 엔드포인트, 액세스 토큰 또는 사용자 입력과 같은 동적 값을 저장하는 데 사용할 수 있는 환경 변수를 정의할 수 있습니다. 이를 통해 개별 요청 세부 정보를 수정하지 않고도 다양한 환경(예: 개발, 스테이징, 프로덕션) 간에 관리하고 전환하는 것이 편리해집니다.
 4.	테스트 및 어설션: Postman을 사용하면 테스트 및 어설션을 작성하여 API 응답의 동작과 정확성을 확인할 수 있습니다. 테스트는 JavaScript를 사용하여 작성할 수 있으며 응답 상태 코드, 헤더, 본문 콘텐츠 또는 기타 관련 데이터에 대한 어설션을 만들 수 있습니다. 이를 통해 유효성 검사 프로세스를 자동화하고 API의 예상 동작을 보장할 수 있습니다.
 5.	응답 시각화: Postman은 구조화되고 읽기 쉬운 형식으로 API 응답을 표시하는 사용자 친화적인 응답 뷰어를 제공합니다. 응답은 원시 데이터, 형식이 지정된 JSON, XML 또는 HTML로 표시될 수 있습니다. 이렇게 하면 API에서 반환된 데이터를 더 쉽게 검사하고 디버그할 수 있습니다.
 6.	컬렉션 공유 및 협업: Postman은 팀워크 및 지식 공유를 촉진하는 협업 기능을 제공합니다. 컬렉션은 팀 구성원 또는 더 넓은 개발자 커뮤니티와 공유할 수 있으므로 다른 사람들이 자신의 Postman 인스턴스에 액세스하고 컬렉션을 가져올 수 있습니다. 이는 API 관련 리소스의 공동 작업, 피드백 및 재사용을 장려합니다.
 7.	자동화된 API 워크플로우: Postman은 여러 요청을 함께 연결하여 자동화된 API 워크플로우를 생성하는 기능을 제공합니다. 이를 통해 한 요청의 출력이 다음 요청의 입력이 되는 복잡한 API 시나리오를 시뮬레이션할 수 있습니다. 자동화된 워크플로는 테스트, 통합 및 개발 프로세스를 간소화하는 데 도움이 됩니다.
 8.	문서 생성: Postman은 제공된 요청, 설명 및 예제 응답을 기반으로 포괄적인 API 문서를 생성할 수 있습니다. 이 문서는 다양한 형식(HTML, Markdown 등)으로 내보낼 수 있으므로 이해 관계자, 클라이언트 또는 다른 개발자와 API 문서를 쉽게 공유할 수 있습니다.
 9.	모의 서버: Postman을 사용하면 실제 API가 구현되기 전에도 API의 동작을 시뮬레이션하는 모의 서버를 만들 수 있습니다. 모의 서버는 통제된 방식으로 프로토타입을 만들고 통합을 테스트하거나 응답을 시뮬레이션하는 편리한 방법을 제공합니다.
 10.	Postman API: Postman 자체는 컬렉션, 환경 및 기타 기능에 프로그래밍 방식으로 액세스할 수 있는 API를 제공합니다. 이는 Postman을 기존 CI/CD(지속적인 통합/지속적인 배포) 파이프라인에 통합하거나 다양한 Postman 작업을 자동화하는 데 사용할 수 있습니다.
요약하면 Postman은 API 개발, 테스트 및 협업을 간소화하는 강력하고 다양한 도구입니다. 사용자 친화적인 인터페이스, 광범위한 기능 및 통합으로 인해 API로 작업하는 개발자와 팀이 많이 선택합니다.


> 홈페이지 기능 및 API

-목표: 동아리 홈페이지 개발
-기술: HTML, CSS, JavaScript, RESTful API, Spring Boot
-보안 강화: 토큰 기반 인증 방식 도입
-데이터 통신: 서버와의 통신을 통해 필요한 데이터 수신
-홈페이지 기능
   -동아리 공지사항: 동아리 내용을 공지하는 기능
   -지출내역: 동아리의 지출 내역을 확인하는 기능
   -소개 페이지: 동아리 소개 및 활동 내용을 제공하는 페이지
   -동아리 규칙: 동아리의 규칙 및 이용약관을 제공하는 페이지
   -동아리 조직도: 동아리 구성원의 조직도 정보 제공
   -동아리 회원의 생일 정보 제공
   -홈페이지 접속일시 기록
-사용된 기술
   동기와 비동기 통신: 페이지 로딩 없이 특정 부분만 수정하는 동적인 화면 구현에 비동기 통신 활용
   -구글 차트: 동아리 조직도를 시각화하기 위해 구글 차트 라이브러리 사용
   -통신 라이브러리: 스프링의 RestTemplate을 사용하여 서버와의 데이터 통신 수행

> DB 테이블 및 구조도

![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/d3eab8aa-0453-4b97-aa81-2a987eba937f)

 테이블 간략 소개 (관계는 구조도 및 테이블 생성 코드 확인)
clubs  
-	동아리에 대한 정보들이 담긴 테이블

club_emergency_contact_network 
-	동아리 비상 연락망 정보가 담긴 테이블

departments 
-	동아리 내 어떤 학과가 있는지 정보가 담긴 테이블

ranks 
-	동아리 내 권한 정보가 담긴 테이블

teams 
-	동아리내 팀 정보가 담긴 테이블

team_closure 
-	부모, 자식 팀 정보를 관리하는 테이블

users 
-	동아리 내 사용자 정보가 담긴 테이블

members 
-	동아리 내 사용자의 팀, 랭크, 학과, 팀 리더 여부, 디폴트 팀 여부 등 다양한 정보를 가지고 있는 테이블

rank_permissions 
-	랭크 권한을 결정하는 테이블

jwt_token 
-	사용자별 access_token의 값, 유효시간, refresh_token의 값, 유효시간을 가지고있는 테이블

user_login 
-	사용자가 로그인할 때마다 ip, 접속 기기 등 다양한 정보를 저장하는 테이블

project_consents 
-	동아리 내 프로젝트 동의 여부

cctv_consents 
-	동아리 내 cctv 녹화 동의 여부

menus 
-	동아리 홈페이지 내 어떤 메뉴들이 있는지 정보가 담긴 테이블

boards 
-	동아리 홈페이지 내 게시판에 대한 정보가 담긴 테이블

bulletins 
-	동아리 홈페이지 내 공지사항에 대한 정보가 담긴 테이블

image_boards 
-	동아리 홈페이지 내 이미지 게시판에 대한 정보가 담긴 테이블

comments 
-	댓글 테이블

common_moneys
-	동아리 내 이미지 보드 별 공유하는 돈을 추가할 수 있고 해당 정보가 담긴 테이블 
 </pre>
</div>



<h2 tabindex="-1" dir="auto"><a id="user-content--웹-서비스-소개" class="anchor" aria-hidden="true" tabindex="-1" href="#-웹-서비스-소개"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path d="m7.775 3.275 1.25-1.25a3.5 3.5 0 1 1 4.95 4.95l-2.5 2.5a3.5 3.5 0 0 1-4.95 0 .751.751 0 0 1 .018-1.042.751.751 0 0 1 1.042-.018 1.998 1.998 0 0 0 2.83 0l2.5-2.5a2.002 2.002 0 0 0-2.83-2.83l-1.25 1.25a.751.751 0 0 1-1.042-.018.751.751 0 0 1-.018-1.042Zm-4.69 9.64a1.998 1.998 0 0 0 2.83 0l1.25-1.25a.751.751 0 0 1 1.042.018.751.751 0 0 1 .018 1.042l-1.25 1.25a3.5 3.5 0 1 1-4.95-4.95l2.5-2.5a3.5 3.5 0 0 1 4.95 0 .751.751 0 0 1-.018 1.042.751.751 0 0 1-1.042.018 1.998 1.998 0 0 0-2.83 0l-2.5 2.5a1.998 1.998 0 0 0 0 2.83Z"></path></svg></a>Ⅲ. 도출 결과 내용<br></h2>

<table>
<thead>
<tr>
<th align="center">로그인 화면</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/fc3bf505-5f2d-4000-8872-4d756c98b7e3" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">회원가입 화면(기본1)</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/1413ff4a-db84-4899-af2f-fdc5ea171229" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>


<table>
<thead>
<tr>
<th align="center">회원가입 화면(2.중복 검사)</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/968de287-9256-437b-b3ad-a86171e46969" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>


<table>
<thead>
<tr>
<th align="center">메인화면</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/063d4fc9-b515-4372-b1ea-fbd3067c9059" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">공지화면</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/5d96bd05-0982-492c-a179-0e2756f8df75" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">규칙화면</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/44ba0b23-7e98-4377-9dd9-1a15a3b65644" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">조직도 화면</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/2d8280c4-540f-4510-973f-aa3d5ce563ea" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">회비 내역 페이지</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/e7c5a7cf-b0fc-4a20-91ac-d12e2ffbc76a" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>



<table>
<thead>
<tr>
<th align="center">사이드바(메뉴 이동 버튼, 동아리 인원 당월 생일, 현재 접속 회원의 최근 접속 시간, 동아리 연락처 정보)</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/ded183d9-5b6e-4a5b-a123-fea06b992df0" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>


<table>
<thead>
<tr>
<th align="center">내비게이션 바(마이페이지 버튼. 각종 커뮤니티 링크(학교,lms,통합정보시스템…...))</th>
</tr>
</thead>
<tbody>
<tr>
<td align="center"><a target="_blank" rel="noopener noreferrer" href=""><img src="https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/c575a630-e7aa-4072-9800-29febdd42b43" alt="Architecture" width="1100px" style="max-width: 100%;"></a></td>
</tr>
</tbody>
</table>











