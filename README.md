# Capstone2-vesion.02- (4학년 2학기 졸업작품)
캡스톤2 템플릿 사용

========================<br>
캡스톤디자인 팀별 결과보고서
학년도 학기	2023년도 1학기
팀 명	웹 서버 구축	결과물 형태	소스코드
수행 과제명	실무에서 자주 사용되는 기술들을 이용한 웹 서버 구축
주제: 동아리 홈페이지


목 차
Ⅰ. 과제 선택
Ⅱ. 팀 구성 및 역할 분담
Ⅲ. 과제 수행 과정 및 내용
Ⅳ. 도출 결과 내용
Ⅴ. 과제 수행 후기



Ⅰ. 과제 선택 
1.	 수행 과제명
: ‘실무에서 자주 사용되는 기술들을 활용한 웹 서버 구축’
2.	 과제 수행 목적
 저희는 실무에서 널리 사용되는 기술들을 활용하여 웹 서버를 구축함으로써, 실제 업무 환경에서 필요한 기술들을 익히고, 이를 통해 현업에서 요구되는 실무 능력을 갖추고자 합니다. 
 실무에서 널리 사용되는 Spring과 Laravel Framework를 사용함으로써, 실제 개발 환경에 적응하고 프로젝트를 효율적으로 구축하는 방법을 익힐 수 있습니다. 
 또한, Docker와 AWS를 활용한 배포와 인프라 관리, 토큰을 사용한 보안 등 실무에 필수적인 기술들을 학습하면서, 프로젝트의 전체적인 흐름과 아키텍처에 대한 이해를 높일 수 있습니다.
3.	 홈페이지 주제
	주제
: ‘동아리 홈페이지 구축’
	동아리 홈페이지가 필요한 이유
 동아리를 오프라인으로만 운영할 경우, 동아리 일정 및 공지사항 등을 전달하는 수단이 제한됩니다. 또한, 회원들 사이의 소통과 조율을 위한 커뮤니케이션 경로가 제한되기도 합니다. 그로 인해 동아리에 대한 구성원들의 관심과 참여도가 낮아질 수 있습니다. 
 또한, 새로운 멤버 모집에도 어려움을 겪을 수 있습니다. 동아리의 가치와 활동에 대한 상세한 정보를 제공할 수 있는 매체의 부족으로 동아리에 대한 인식을 높이는 것이 어려워질 수 있습니다.
 동아리 홈페이지의 존재는 이러한 애로사항들을 해결함과 동시에, 회원들의 공동체 의식을 형성하고, 동아리를 보다 효율적으로 운영하도록 도와줍니다.
	동아리 홈페이지 구축으로 인한 장점 및 효과
	커뮤니케이션 강화
: 동아리 웹 페이지를 통해 동아리 회원들과의 소통이 원할해지며, 
 새로운 아이디어나 의견을 공유하고 협업할 수 있습니다.
	일정 및 공지사항 관리
: 활동 일정, 회의 및 이벤트 공지사항을 효율적으로 관리하고 공유할 수 있습니다.
	멤버 모집 효과
: 동아리의 목표와 가치를 효율적으로 전달하고, 홈페이지를 통해 동아리에 대한 자세한 정보를 제곰함으로써 새로운 회원 모집에 도움을 줍니다.
	브랜딩과 이미지 강화
: 동아리 웹 페이지를 통해 동아리가 진행한 프로젝트나 활동 내용을 시각적으로 보여줌으로써 동아리의 이미지를 강화할 수 있습니다.

 
Ⅱ. 팀 구성 및 역할 분담
1.	팀명
: 웹 서버 구축
2.	역할 분담
- 백엔드 개발
- AWS 클라우드 환경 구성 및 관리
- Docker를 활용한 애플리케이션 컨테이너화 및 배포
- 보안 관련 작업, 토큰 기반 인증 구현
- 데이터베이스 모델링 및 관리
- API 개발 및 테스트
- 프론트엔드와 백엔드 팀 간의 협업 조율
- 전체적인 프로젝트 일정 관리 및 진행 상황 모니터링
- 백엔드 프레임워크(Laravel Framework)를 활용한 서버 사이드 로직 구현
- 프로젝트 결과물 통합 및 최종 보고서 작성

- 프론트엔드 개발
- UI 요소 개발
- 프론트 엔드와 백엔드 서비스 간의 통합 작업
- 사용자 인터페이스의 테스트 및 디버깅
- HTML, CSS, JavaScript 등을 활용한 웹 프론트엔드 개발 작업



Ⅲ. 과제 수행 과정 및 내용
	프로젝트 진행 일정표
주차  /	활동 내용
1.	프로젝트 주제 선정 및 구현할 웹 페이지 후보 도출
2.	1명씩 각 후보 주제를 맡아 구체화 후, 회의 진행
최종 주제 선정: ‘동아리 홈페이지’
3.	[프론트앤드]
- 영역별 기능 세분화

[백엔드]
- MacOS, Windows에 Laravel 환경 설치 및 백엔드 기능 구상
4.	개발환경 회의 및 선정

[프론트엔드]
- 프레임워크: SpringBoot
- IDE: Intellij
- 뷰템플릿: thymeleaf

[백엔드]
- 프레임워크: Laravel
- IDE: VS Code
- 서버: AWS (ec2)
5.	개발 환경 구축

[프론트엔드]
- Intellij, Git 설치
- SpringBoot 프로젝트 생성
- 뷰템플릿: thymeleaf
- 개발에 필요한 의존성 주입
- 포트 및 기타 경로 설정(application.yml)
- 프로젝트 구조 잡기 (MVC 모델)

[백엔드]
- Laravel에 pgsql, redis 연결
- MacOS와 Windows에 php 및 Laravel 환경 구축
- Docker 환경 구성 및 pgsql, redis 등 컨테이너 이미지 생성
- VS Code에 개발에 필요한 확장 라이브러리 설치
6.	[프론트엔드]
- 전체 페이지에 필요한 공통 템플릿 개별 생성
: 네비개이션바

[백엔드]
- 프론트엔드에서 요청한 API 작성
7.	[프론트엔드]
- 전체 페이지에 필요한 공통 템플릿 개별 생성
: 메뉴 탭

[백엔드]
- 프론트엔드에서 요청한 API 작성
- 옵저버 부착
8.	[프론트엔드]
- 메인 페이지 레이아웃 잡기 및 디자인

[백엔드]
- 프론트엔드에서 요청한 API 작성
9.	[프론트엔드]
- 공지 페이지 레이아웃 설계 및 디자인

[백엔드]
- 프론트엔드에서 요청한 API 작성
10.	- 기본 사용자 인증 시스템 구축
(로그인, 로그아웃, 비밀번호 재설정)
- 사용자 및 세션에 대한 데이터베이스 스키마 설정
- 인증 시스템에 대한 단위 테스트 진행
11.	- 회원가입 기능 구현
- 등록 양식에 양식 유효성 검사 및 오류 처리 추가
- 등록 기능에 대한 단위 테스트 진행
12.	- 게시판의 CRUD(생성, 읽기, 업데이트, 삭제) 기능 구축
- 게시판 페이지 번호 및 정렬 구현
- 게시판 기능에 대한 단위 테스트 진행
13.	- 게시판 댓글 기능 개발
- 중첩 댓글 및 답글 기능 구현
- 주석 기능에 대한 단위 테스트 진행
14.	- 알림 기능에 대한 CRUD 구현
- 알림 기능에 대한 단위 테스트 진행
15.	- 다양한 사용자 역할(관리자, 중재자, 일반 사용자) 부여 기능 개발
- 각 역할에 대한 권한 및 액세스 수준 정의
- 인증 기능에 대해 단위 테스트 진행
- 프로필 및 설정에 액세스할 수 있는 사용자 대시보드 구축
- 프로필 편집 및 비밀번호 변경 기능 구현
- 사용자 대시보드에 대한 단위 테스트 진행
- 전체 웹 애플리케이션의 전반적인 테스트 및 디버깅

![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/8b909c6a-a9d0-4e06-be1c-b8f5787c67be)

 
 
	사용된 기술 스택 소개
1.	프론트엔드 기술 스택
	Spring Boot Framework
- Java 기반의 웹 애플리케이션 개발을 위한 프레임워크입니다.
- Spring Boot의 자동 설정 기능으로 복잡한 환경 설정에 대한 개발자의 부담을 덜여줍니다.
- 강력한 의존성 주입(DI) 기능으로 객체 간의 결합도를 낮추고 유연성과 재사용성을
  향상시킬 수 있습니다.
- 다양한 오픈 소스 라이브러리, 플러그인, 문서, 튜토리얼 등이 존재하여 
  프로젝트 진행 시 발생한 문제점을 빠르게 해결할 수 있습니다.
	Intellij
- 프론트엔드 및 백엔드 개발에 널리 사용되는 통합 개발 환경(IDE) 입니다.
- 사용자 친화적인 인터페이스를 제공하며, 코드 완성, 자동 포맷팅, 실시간 오류 검사 등의
  기능을 통해, 보다 효율적으로 코드를 작성할 수 있도록 도와줍니다.
- 특정 프레임워크나 라이브러리에 특화된 플러그인을 사용하여 생산성을 높일 수 있습니다. 
- Git, SVN 등의 버전 관리 시스템을 통합하여 사용할 수 있어, 버전 관리 및 협업 작업을
  원할하게 수행하도록 도와줍니다.
	그 외 등등..

2.	백엔드 기술 스택
	Laravel Framework
- PHP 기반 웹 애플리케이션 개발을 위한 프레임워크로, 라우팅을 쉽게 정의하고 관리할 수 
  있으며, MVC 패턴을 사용하여 비즈니스 로직과 뷰를 분리하여 개발할 수 있습니다.
- Eloquent ORM을 통해 DB와의 상호작용을 쉽게 처리할 수 있으며, 
  SQL쿼리를 직접 작성하지 않고도 객체지향적인 방식으로 데이터를 다룰 수 있습니다.
- 마이그레이션(Migration) 기능을 통해, DB 스키마를 정의하고, 데이터를 생성, 수정,
  삭제할 수 있습니다. 또한, 시딩(Seeding)을 통해 초기 데이터를 쉽게 삽입할 수 있습니다.
	Docker 및 Docker Sail
- Docker는 애플리케이션을 컨테이너화하여 배포 및 관리하는 컨테이너 플랫폼으로, 
애플리케이션을 실행하는 환경을 동일하게 유지하여 개발 환경과 운영 환경 사이의 
일관성을 유지할 수 있습니다.
- Docker Sail은 Laravel 개발자들을 위한 Docker 개발환경으로 Laravel 프로젝트의 개발 및 배포를 더욱 편리하게 할 수 있도록 도와줍니다.
- 프로젝트를 간단하게 배포할 수 있습니다. Docker 이미지를 사용하여 애플리케이션을 패키징하고, 필요한 환경에서 실행할 수 있습니다. 또한, 배포 과정에서 발생할 수 있는 호환성 문제를 최소화하고, 애플리케이션의 배포 속도를 향상시킬 수 있습니다.

	Sail
Sail은 널리 사용되는 PHP 웹 애플리케이션 프레임워크인 Laravel에서 제공하는 경량 명령줄 인터페이스(CLI) 도구입니다. Sail은 Docker 컨테이너를 사용하여 Laravel 애플리케이션을 실행하기 위한 설정 및 구성 프로세스를 단순화합니다. 개발 환경에서 Laravel 애플리케이션을 관리하고 배포하는 편리한 방법을 제공합니다.
Sail을 사용하여 개발자는 Laravel 애플리케이션을 실행하는 데 필요한 모든 필수 종속성 및 서비스로 개발 환경을 쉽게 설정할 수 있습니다. Sail은 Docker를 활용하여 PHP, Nginx, MySQL, Redis 등과 같은 서비스를 위한 격리된 컨테이너를 생성합니다. 이러한 서비스를 개별적으로 구성하고 관리하는 복잡성을 추상화하여 개발자가 애플리케이션 코딩 및 테스트에 더 쉽게 집중할 수 있도록 합니다.
Sail은 Laravel 애플리케이션용으로 특별히 설계된 사전 빌드된 Docker Compose 파일을 제공합니다. 이 Compose 파일은 애플리케이션을 실행하는 데 필요한 서비스, 네트워크 구성 및 볼륨을 정의합니다. 개발자는 추가 서비스 추가 또는 기존 서비스 수정과 같은 프로젝트 요구 사항에 따라 Compose 파일을 사용자 지정할 수 있습니다.
Sail을 사용하는 방법은 간단합니다. 시스템에 Docker를 설치한 후 단일 명령을 실행하여 Laravel 프로젝트에서 Saile을 초기화할 수 있습니다. 이 명령은 Docker Compose 파일과 Laravel 애플리케이션에 특정한 Dockerfile을 포함하여 필요한 Docker 구성 파일을 생성합니다.
Sail이 설정되면 다양한 명령을 사용하여 Laravel 애플리케이션 및 기본 Docker 컨테이너와 상호 작용할 수 있습니다. 예를 들어 개발 환경을 시작하고, 데이터베이스 마이그레이션을 실행하고, PHPUnit 테스트를 실행하고, 애플리케이션 셸에 액세스하거나 Composer 종속성을 설치할 수 있습니다. Sail은 Docker 관련 명령을 추상화하고 개발 환경 관리를 위한 일관된 Laravel 관련 인터페이스를 제공합니다.
Sail은 설치 용이성, 재현성 및 격리를 포함하여 Docker의 이점을 Laravel 개발에 제공합니다. 이를 통해 개발자는 서로 다른 프로젝트 간에 빠르게 전환할 수 있으며 팀 구성원 간에 일관된 환경을 보장할 수 있습니다. Sail을 활용함으로써 개발자는 기본 인프라 관리의 복잡성에 대해 걱정하지 않고 Laravel 애플리케이션을 구축하고 테스트하는 데 집중할 수 있습니다.

	AWS
- 클라우드 컴퓨팅 기반 서비스로서 서버 구축, 데이터베이스 관리 등을 위해 사용됩니다.
- 필요에 따라 리소스를 신속하게 확장하거나 축소할 수 있기 때문에, 소규모 프로젝트에서도
  적은 비용과 노력으로 필요한 인프라를 유연하게 조정할 수 있는 장점이 있습니다. 또한,
  필요한 만큼만 사용하고 지불하는 Pay-as-you-go 방식이므로, 예산 관리 측면에 유용합니다.
- AWS는 글로벌 인프라를 보유하고 있어, 강력한 가용성과 안정성이 제공됩니다. 이로 인해, 
  소규모 프로젝트에서도 AWS의 다양한 서비스를 통해 고가용성 아키텍처를 구성할 수 있고
  장애 발생 시에도 서비스의 지속적인 가용성을 보장할 수 있습니다.
	AWS EC2
AWS EC2(Elastic Compute Cloud)는 클라우드에서 가상 서버를 시작하고 관리할 수 있도록 Amazon Web Services(AWS)에서 제공하는 웹 서비스입니다. 확장 가능한 컴퓨팅 리소스를 제공하여 애플리케이션 요구 사항에 따라 가상 머신 인스턴스를 신속하게 프로비저닝하고 구성할 수 있습니다. EC2는 다양한 기능을 제공하므로 많은 클라우드 기반 애플리케이션의 기본 빌딩 블록이 됩니다.
다음은 AWS EC2의 주요 측면과 기능입니다.
1.	가상 서버 인스턴스: EC2를 사용하면 다양한 구성으로 EC2 인스턴스로 알려진 가상 서버 인스턴스를 생성할 수 있습니다. CPU, 메모리, 스토리지 및 네트워크 성능과 같은 요소를 기반으로 인스턴스 유형을 선택할 수 있습니다. EC2는 범용 컴퓨팅, 메모리 집약적 애플리케이션, GPU 기반 처리 및 고성능 네트워킹과 같은 다양한 워크로드에 최적화된 광범위한 인스턴스 유형을 지원합니다.
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

	PostgreSQL
- 오픈 소스 관계형 데이터베이스 관리 시스템(RDBMS)으로, 고급 SQL 기능을 제공하며,
풍부한 데이터 유형과 복잡한 쿼리가 지원됩니다.
- JSON 데이터 형식과 공간 데이터 타입 등 다양한 확장 기능을 포함하고 있어 
다양한 데이터 모델링 요구 사항을 충족시킬 수 있습니다.
- ACID (원자성, 일관성, 고립성, 지속성) 트랜잭션을 지원하여 데이터의 무결성을 보장하며,
  다양한 보안 기능과 접근 제어, 암호화, SSL/TLS 연결 등의 기능을 통해, DB의 안정성 및 
  데이터의 기밀성과 무결성을 강화할 수 있습니다.
- 활발한 커뮤니티와 지원을 통해 다양한 문서, 튜토리얼, 예제 코드 등을 쉽게 찾을 수 있습니다.
- 이러한 장점들로 인해, PostgreSQL은 백엔드 개발에서 안정성, 확장성, 성능 및 데이터 보안 측면의 요구 사항을 충족시킬 수 있는 강력한 선택지가 될 수 있습니다.
	토큰
- 토큰을 사용하여 사용자의 신원을 증명 및 인증하고, 사용자에 대한 권한을 
  부여할 수 있습니다. 또한, 암호화된 정보를 전달하고, 중요한 데이터를 보호할 수 있습니다. - 토큰 기반 인증은 세션 관리 없이도, 다양한 플랫폼 및 디바이스에서 사용자 경험을 
  향상시킵니다. 사용자는 토큰을 통해 로그인한 뒤, 지속적인 인증 없이 서비스를 이용할 
  수 있습니다. 
	VS Code
- 경량 코드 편집기로, 백엔드 개발에 많이 사용되는 강력한 도구입니다.
- 사용자 친화적인 인터페이스와 직관적인 단축키로, 개발자들이 빠르게 익힐 수 있고, 
  자신만의 단축키도 쉽게 설정할 수 있습니다.
- 풍부한 확장 기능으로 필요한 기능을 쉽게 추가할 수 있고, 프로젝트에 맞게 환경을 
  구성할 수 있어, 개발 생산성을 높이도록 도와줍니다.
- Git 등의 버전 관리 시스템을 통합하여 사용할 수 있고, 변경 사항의 추적, 병합, 커밋 
  등을 간편하게 수행할 수 있으며, 협업 작업을 원활하게 진행할 수 있습니다.

3.	공통 기술 사용
	Table Plus
TablePlus는 사용자 친화적이고 효율적인 방식으로 다양한 데이터베이스와 상호 작용할 수 있는 현대적이고 직관적인 데이터베이스 관리 도구입니다. 데이터베이스 관리 작업을 간소화하고 생산성을 향상시키도록 설계되었습니다. 다음은 TablePlus의 주요 특징 및 기능입니다.
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

	PostMan
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


	홈페이지 기능 및 API

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

	DB 테이블 및 구조도
![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/fd3197df-d5c1-4de8-b1da-5eaad6d782b0)

 

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


테이블 생성 코드
# clubs table
Schema::create('clubs', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('동아리 이름');
            $table->unsignedBigInteger('code')->nullable()->comment('동아리 코드');
            $table->unsignedBigInteger('position')->nullable()->comment('동아리 번호');
            $table->string('grade', 100)->nullable()->comment('동아리 권한');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('name');
            $table->unique('code');

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');
        });

# club_emergency_contact_network table
Schema::create('club_emergency_contact_network', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('동아리 비상연락망 번호');
            $table->unsignedBigInteger('club_id')->comment('동아리 번호');
            $table->string('email', 100)->nullable()->comment('비상 이메일');
            $table->json('phone')->nullable()->comment('비상 전화번호');
            $table->string('location', 100)->nullable()->comment('동아리 위치');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('club_id');

            # 인덱스
            $table->index('id');
            $table->index('club_id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

# departments table
Schema::create('departments', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('학과 번호');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('학과 이름');
            $table->string('code', 100)->nullable()->comment('학과 코드');
            $table->unsignedBigInteger('position')->nullable()->comment('학과 순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('name');
            $table->unique('code');

            # 인덱스
            $table->index('id');
            $table->index('name');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

# ranks table
Schema::create('ranks', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('랭크 번호');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('랭크 이름');
            $table->unsignedBigInteger('position')->nullable()->comment('랭크 순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

# teams table
Schema::create('teams', function (Blueprint $table) {
            $table->increments('id')->comment('팀 아이디');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 50)->nullable()->comment('팀 이름');
            $table->string('path', 100)->nullable()->comment('상위팀 포함 팀 경로');
            $table->unsignedBigInteger('parent_id')->nullable();
            $table->unsignedBigInteger('position');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 인덱스
            $table->index('id');
            $table->index('club_id');
            $table->index('parent_id');
            $table->index('position');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('parent_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('set null');
        });

# team 클로저 테이블
Schema::create('team_closure', function (Blueprint $table) {
            $table->bigIncrements('closure_id');
            $table->unsignedBigInteger('ancestor');
            $table->unsignedBigInteger('descendant');
            $table->unsignedInteger('depth');

            # 인덱스
            $table->index('ancestor');
            $table->index('descendant');

            # 키값
            $table->foreign('ancestor')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('descendant')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
        });

# users table
Schema::create('users', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('사용자 번호');
            $table->unsignedBigInteger('club_id')->comment('동아리 번호');
            $table->unsignedBigInteger('department_id')->comment('학과 번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('직위번호');
            $table->unsignedBigInteger('student_id')->nullable()->comment('학생 번호');
            $table->string('name', 100)->nullable()->comment('성+이름');
            $table->string('gender', 100)->nullable()->comment('성별');
            $table->json('phone')->nullable()->comment('전화번호');
            $table->string('email', 100)->nullable()->comment('이메일 주소');
            $table->string('address', 200)->nullable()->comment('주소');
            $table->date('birth_date')->nullable()->comment('생년월일');
            $table->string('password')->nullable()->comment('비밀번호');
            $table->unsignedBigInteger('out_count')->nullable()->comment('경고 횟수');
            $table->unsignedBigInteger('password_fail_count')->nullable()->comment('비밀번호 틀린 횟수');
            $table->timestampTz('password_updated_at', $precision = 3)->nullable()->comment('비밀번호 변경 일시');
            $table->timestampTz('last_login_at', $precision = 3)->nullable()->comment('마지막 로그인 시간');
            $table->timestampTz('banned_at', $precision = 3)->nullable()->comment('접속제한 일시');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique(['club_id', 'student_id']);

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('department_id')->references('id')->on('departments')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('cascade');
        });

# members table
Schema::create('members', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('department_id')->nullable()->comment('학과번호');
            $table->unsignedBigInteger('team_id')->nullable()->comment('팀번호');
            $table->unsignedBigInteger('user_id')->comment('동아리 회원 번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('직위번호');
            $table->unsignedSmallInteger('position')->comment('표시순서');
            $table->boolean('default')->default(false)->comment('사용자의 메인 팀 여부');
            $table->boolean('leader')->default(false)->comment('팀 리더 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['team_id', 'user_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('department_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('department_id')->references('id')->on('departments')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('team_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('set null');
        });

# rank_permissions table
Schema::create('rank_permissions', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('랭크번호');
            $table->boolean('board_access')->comment('게시판 권한');
            $table->boolean('comment_access')->comment('댓글 권한');
            $table->boolean('image_add_access')->comment('이미지 업로드 권한');
            $table->boolean('anonymous_comment_access')->comment('익명 댓글 권한');
            $table->boolean('community_add_access')->comment('커뮤니티 추가 권한');
            $table->boolean('user_ben_access')->comment('사용자 벤 권한');
            $table->boolean('admin_board_access')->comment('관리자 관련 게시판 탭 권한');
            $table->boolean('user_change_access')->comment('특정 사용자 변경 권한');
            $table->boolean('admin_access')->comment('어드민 권한');
            $table->unsignedSmallInteger('position')->comment('표시순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'rank_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('rank_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('cascade');
        });

# access_tokens table
Schema::create('jwt_token', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자아이디');
            $table->string('access_token', 500)->nullable()->comment('액세스토큰');
            $table->timestampTz('access_token_end_at')->nullable()->comment('액세스토큰 만료 일시');
            $table->string('refresh_token', 500)->nullable()->comment('재발급토큰');
            $table->timestampTz('refresh_token_end_at')->nullable()->comment('재발급토큰 만료 일시');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'user_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

# user_login table
Schema::create('user_login', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자아이디');
            $table->string('ip', 100)->nullable()->comment('접속 ip');
            $table->string('device', 100)->nullable()->comment('접속 기기');
            $table->string('etc', 100)->nullable()->comment('기타');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

# project_consents table
Schema::create('project_consents', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('랭크번호');
            $table->boolean('consent')->default(true)->comment('여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

# cctv_consents table
Schema::create('cctv_consents', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->boolean('consent')->default(true)->comment('동의여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

# menus table
Schema::create('menus', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('type', 50)->nullable()->comment('메뉴 타입');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('type');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

# boards table
Schema::create('boards', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('content', 2000)->nullable()->comment('내용');
            $table->unsignedBigInteger('hits')->comment('조회 수');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->boolean('image')->default(false)->comment('이미지 여부');
            $table->boolean('block_comment')->default(false)->comment('댓글 금지 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

# bulletins table
Schema::create('bulletins', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('content', 2000)->nullable()->comment('내용');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

# common_moneys table
Schema::create('common_moneys', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->unsignedBigInteger('money')->comment('돈');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'menu_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

# image_boards table
Schema::create('image_boards', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->unsignedBigInteger('image_id')->nullable()->comment('이미지번호');

            $table->string('title', 100)->nullable()->comment('제목');
            $table->unsignedBigInteger('money')->nullable()->comment('지불');

            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('image_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

# comments table
Schema::create('comments', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('board_id')->comment('게시판번호');
            $table->string('content', 300)->nullable()->comment('내용');
            $table->boolean('hidden_comment')->default(false)->comment('비밀 댓글 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('board_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('board_id')->references('id')->on('boards')->onUpdate('cascade')->onDelete('cascade');
        });

	Test Code
테스트 스크립트 또는 테스트 사례라고도 하는 테스트 코드는 소프트웨어 시스템의 기능과 정확성을 확인하기 위해 작성된 일련의 지침 또는 절차입니다. 이는 소프트웨어 테스트 프로세스의 필수 부분이며 소프트웨어가 예상대로 작동하고 지정된 요구 사항을 충족하는지 확인하는 데 사용됩니다.
테스트 코드는 일반적으로 소프트웨어 테스터 또는 품질 보증(QA) 엔지니어가 작성합니다. 테스트를 실행하고 다양한 조건에서 소프트웨어의 동작을 검증하기 위한 가이드 역할을 합니다. 테스트 코드의 주요 목적은 결함을 감지하고 문제를 식별하며 소프트웨어의 전반적인 품질과 신뢰성을 보장하는 것입니다.
다음은 테스트 코드의 몇 가지 주요 측면입니다.
1.	테스트 시나리오: 테스트 코드에는 소프트웨어 시스템의 다양한 측면을 다루는 다양한 테스트 시나리오가 포함됩니다. 이러한 시나리오는 소프트웨어의 특정 기능 또는 기능을 테스트하도록 설계되었습니다.
2.	입력 및 예상 출력: 테스트 코드는 테스트를 위해 소프트웨어에 제공해야 하는 입력 또는 테스트 데이터를 정의합니다. 또한 이러한 입력에 대한 응답으로 예상되는 출력 또는 소프트웨어에서 예상되는 동작을 지정합니다.
3.	전제조건 및 사후조건: 테스트 코드에는 테스트 케이스 실행 전후에 충족해야 하는 전제조건 및 사후조건이 포함될 수 있습니다. 이러한 조건은 테스트 환경이 적절하게 설정되고 소프트웨어가 테스트를 위해 예상되는 상태에 있는지 확인합니다.
4.	어설션 및 어설션: 테스트 코드에는 예상 출력과 비교하여 소프트웨어의 실제 출력 또는 동작을 확인하는 어설션 또는 체크포인트가 포함되는 경우가 많습니다. 이러한 어설션은 소프트웨어가 올바르게 작동하는지 또는 불일치가 있는지 확인하는 데 도움이 됩니다.
5.	테스트 실행 단계: 테스트 코드는 테스트 사례를 실행하는 방법에 대한 단계별 지침을 제공합니다. 여기에는 세부 절차, 테스트 데이터 설정 및 테스트 실행 중에 수행할 작업이 포함될 수 있습니다.
6.	테스트 데이터: 테스트 코드는 테스트에 사용할 데이터 또는 값을 지정합니다. 여기에는 다양한 시나리오와 에지 케이스를 처리하기 위한 유효 데이터와 유효하지 않은 데이터가 모두 포함됩니다.
7.	테스트 범위: 테스트 코드는 적절한 테스트 범위를 달성하는 것을 목표로 합니다. 즉, 포괄적인 테스트를 보장하기 위해 모든 중요한 기능, 다양한 경로 및 에지 케이스를 테스트하는 것을 의미합니다.
8.	문서화: 테스트 코드는 종종 테스트 사례에 대한 명확한 지침, 설명 및 설명을 제공하기 위해 문서화됩니다. 이 문서는 테스트 사례의 목적, 범위 및 예상 결과를 이해하는 데 도움이 됩니다.
전반적으로 테스트 코드는 소프트웨어 테스트 프로세스의 중요한 구성 요소입니다. 결함을 식별하고 소프트웨어 품질을 개선하며 소프트웨어 시스템의 안정성과 성능에 대한 확신을 제공하는 데 도움이 됩니다.

Laravel 백엔드 api와 라우터, 미들웨어, 옵저버, 모델을 모두 테스트코드를 작성하지는 않았지만 핵심 부분은 테스트 코드를 작성했습니다.

예시 이미지)
![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/dccca6c9-f8eb-4e28-801c-12c69b7fe514)

 
Ⅳ. 도출 결과 내용

프론트

메인 홈페이지 및 기능별 사진 삽입
-로그인 화면
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/4798dffb-0db0-48b5-beaa-a63c72ee6d23)


-회원가입 화면(1.기본)
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/cc30fe46-4f43-4a4a-b5ea-1b430a047331)


-회원가입 화면(2.중복 검사)
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/d392f5d3-d8f0-49b9-b075-b21a0afa567c)


-메인화면
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/93aa7880-a2a6-4993-b4aa-dfdd80cbf706)


-공지 화면
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/1df792bc-018a-4813-aaab-519e1956663b)


-규칙 화면
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/9d6df55d-6497-4e9b-b925-4dbd3b94c23a)


-조직도 회면
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/96a4ee52-36ea-4170-a996-47d478069363)


-회비 내역 페이지
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/ad61fc97-cd94-463a-91b6-740f0c57a0c5)


-사이드바(메뉴 이동 버튼, 동아리 인원 당월 생일, 현재 접속 회원의 최근 접속 시간, 동아리 연락처 정보)
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/75ccfda3-94c7-4da5-99fd-cc69ea95ac82)

-내비게이션 바(마이페이지 버튼. 각종 커뮤니티 링크(학교,lms,통합정보시스템…...))
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/14a0a804-49c6-4e3f-b52c-dd52c6b13a83)


백엔드

Docker
docekr-compose 파일 구성
# For more information: https://laravel.com/docs/sail
version: "3"

services:
    laravel.test:
        container_name: ov-api
        build:
            context: ./docker/8.1
            dockerfile: Dockerfile
            args:
                WWWGROUP: "${WWWGROUP}"
        image: sail-8.1/app
        extra_hosts:
            - "host.docker.internal:host-gateway"
        ports:
            # - "${APP_PORT:-8080}:80"
            - "${LARAVEL_WEBSOCKETS_PORT:-6001}:${LARAVEL_WEBSOCKETS_PORT:-6001}"
            - 6002:6002
        environment:
            WWWUSER: "${WWWUSER}"
            LARAVEL_SAIL: 1
            XDEBUG_MODE: "${SAIL_XDEBUG_MODE:-off}"
            XDEBUG_CONFIG: "${SAIL_XDEBUG_CONFIG:-client_host=host.docker.internal}"
        volumes:
            - ".:/var/www/html"
        networks:
            - sail
        depends_on:
            - postgres

    redis:
        restart: always
        image: redis:alpine
        container_name: redis
        command: [ "redis-server", "--appendonly", "yes" ]
        volumes:
            - sailredis:/data
        ports:
            - 6380:6379
        networks:
            - sail

    postgres:
        image: postgres:14
        container_name: postgres
        restart: always
        volumes:
            - sailpostgres:/var/lib/postgresql/data
        environment:
            TZ: Asia/Seoul
            # POSTGRES_USER: root
            POSTGRES_PASSWORD: postgres
            POSTGRES_DB: officewave
        ports:
            - 5434:5432
        networks:
            - sail

    mongodb:
        image: "bitnami/mongodb:4.4"
        container_name: mongodb
        networks:
            - sail
        restart: always
        ports:
            - 27017:27017
        environment:
            MONGODB_ADVERTISED_HOSTNAME: mongodb
            # MONGODB_REPLICA_SET_MODE: primary
            # MONGODB_REPLICA_SET_KEY: ${DB_MONGO_REPLICA_SET_KEY}
            # MONGODB_REPLICA_SET_NAME: ${DB_MONGO_REPLICA_SET_NAME}
            # MONGODB_ROOT_USERNAME: root
            MONGODB_ROOT_PASSWORD: ${DB_MONGO_PASSWORD}
            MONGODB_USERNAME: ${DB_MONGO_USERNAME}
            MONGODB_PASSWORD: ${DB_MONGO_PASSWORD}
            MONGODB_DATABASE: ${DB_MONGO_DATABASE}
        volumes:
            - "sailmongo:/bitnami"
            # - ./templates/mongo/mongodb_primary.conf:/bitnami/mongodb/conf/mongodb.conf:ro
            # mongodb-secondary:
            #     image: "bitnami/mongodb:5.0"
            #     container_name: mongodb-secondary
            #     networks:
            #         - sail
            #     restart: always
            #     ports:
            #         - 27018:27017
            #     environment:
            #         MONGODB_ADVERTISED_HOSTNAME: mongodb-secondary
            #         MONGODB_REPLICA_SET_MODE: secondary
            #         MONGODB_REPLICA_SET_KEY: ${DB_MONGO_REPLICA_SET_KEY}
            #         MONGODB_REPLICA_SET_NAME: ${DB_MONGO_REPLICA_SET_NAME}
            #         MONGODB_INITIAL_PRIMARY_HOST: mongodb-primary
            #         MONGODB_INITIAL_PRIMARY_PORT_NUMBER: 27017
            #         # MONGODB_INITIAL_PRIMARY_ROOT_USERNAME: root
            #         MONGODB_INITIAL_PRIMARY_ROOT_PASSWORD: ${DB_MONGO_PASSWORD}
            #     volumes:
            #         - "sailmongo2:/bitnami"
            #         # - ./templates/mongo/mongodb_secondary.conf:/bitnami/mongodb/conf/mongodb.conf:ro
            #     depends_on:
            #         - mongodb-primary
            # mongodb-arbiter:
            #     image: "bitnami/mongodb:5.0"
            #     container_name: mongodb-arbiter
            #     networks:
            #         - sail
            #     restart: always
            #     ports:
            #         - 27019:27017
            #     environment:
            #         MONGODB_ADVERTISED_HOSTNAME: mongodb-arbiter
            #         MONGODB_REPLICA_SET_MODE: arbiter
            #         MONGODB_REPLICA_SET_KEY: ${DB_MONGO_REPLICA_SET_KEY}
            #         MONGODB_REPLICA_SET_NAME: ${DB_MONGO_REPLICA_SET_NAME}
            #         MONGODB_INITIAL_PRIMARY_HOST: mongodb-primary
            #         MONGODB_INITIAL_PRIMARY_PORT_NUMBER: 27017
            #         MONGODB_INITIAL_PRIMARY_ROOT_PASSWORD: ${DB_MONGO_PASSWORD}
            #     volumes:
            #         - "sailmongo3:/bitnami"
            #         # - ./templates/mongo/mongodb_secondary.conf:/bitnami/mongodb/conf/mongodb.conf:ro
            #     depends_on:
            #         - mongodb-secondary

            # mongo-express:
            #     image: mongo-express
            #     restart: always
            #     ports:
            #         - 8081:8081
            #     environment:
            #         ME_CONFIG_MONGODB_SERVER: mongodb
            #         ME_CONFIG_MONGODB_ENABLE_ADMIN: 0
            #         # ME_CONFIG_MONGODB_ADMINUSERNAME: root
            #         # ME_CONFIG_MONGODB_ADMINPASSWORD: mongodb
            #         #ME_CONFIG_MONGODB_URL: mongodb://root:mongodb@mongo:27017/
            #         # ME_CONFIG_MONGODB_URL: mongodb://mongodb:27017
            #         ME_CONFIG_OPTIONS_EDITORTHEME: ambiance
            #         ME_CONFIG_MONGODB_AUTH_DATABASE: ${DB_MONGO_DATABASE}
            #         ME_CONFIG_MONGODB_AUTH_USERNAME: ${DB_MONGO_USERNAME}
            #         ME_CONFIG_MONGODB_AUTH_PASSWORD: ${DB_MONGO_PASSWORD}
            #     networks:
            #         - sail

    elasticsearch:
        image: elasticsearch:7.17.0
        container_name: elasticsearch
        entrypoint:
            - sh
            - -c
            - "elasticsearch-plugin install analysis-nori; /usr/local/bin/docker-entrypoint.sh elasticsearch"
            # - "/usr/local/bin/docker-entrypoint.sh elasticsearch"
        ports:
            - 9200:9200
            - 9300:9300
        volumes:
            - sailelasticsearch:/usr/share/elasticsearch/data
        environment:
            - discovery.type=single-node
            - "ES_JAVA_OPTS=-Xms1g -Xmx1g"
            # - TZ=Asia/Seoul
            # - ELASTIC_USERNAME=${ELASTIC_USERNAME}
            # - ELASTIC_PASSWORD=officewave
            # - xpack.security.enabled=true
            # - xpack.security.transport.ssl.enabled=true
        user: root
        restart: always
        privileged: true
        networks:
            - sail

    minio:
        restart: always
        image: minio/minio:latest
        container_name: minio
        hostname: minio
        environment:
            MINIO_ROOT_USER: minio
            MINIO_ROOT_PASSWORD: minio123
        command: server --address ":9100" --console-address ":9101" /data
        # command: server /data --console-address ":9001" # http://minio{1...4}/data{1...2}
        volumes:
            - sailminio:/data
            # - sailminio1-2:/data2
        ports:
            - 9100:9100
            - 9101:9101
        healthcheck:
            test:
                [
                    "CMD",
                    "curl",
                    "-f",
                    "http://localhost:9001/minio/health/live"
                ]
            interval: 30s
            timeout: 20s
            retries: 3
        networks:
            - sail

    crosseditor:
        restart: always
        image: docker.jiransoft.co.kr/officewave/cross-editor:1.0.0
        container_name: crosseditor
        networks:
            - sail

    preview:
        restart: always
        image: docker.jiransoft.co.kr/officewave/document-preview:1.0.4-rc.1
        container_name: preview
        environment:
            CONTAINER_ROLE: preview
        ports:
            - 8001:8001
        networks:
            - sail

    nginx:
        restart: always
        image: nginx:stable-alpine
        container_name: nginx
        volumes:
            - "./docker/nginx_dev.conf:/etc/nginx/nginx.conf:ro"
        ports:
            - 80:80
        networks:
            - sail
networks:
    sail:
        driver: bridge
volumes:
    sailpostgres:
        driver: local
    sailredis:
        driver: local
    sailmongo:
        driver: local
    # sailmongo2:
    #     driver: local
    # sailmongo3:
    #     driver: local
    sailelasticsearch:
        driver: local
    sailminio:
        driver: local
    # sailminio2:
    #     driver: local
    # sailminio2-1:
    #     driver: local
    # sailminio2-2:
    #     driver: local


이렇게 docker-compose 파일의 내용물을 구성하였습니다.

Sail
./vendor/bin/sail up -d를 이용하여 docker에 컨테이너 업로드
![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/cab78d99-cab6-4a61-92ca-d9d9e460acb6)

 
AWS EC2
Aws 인스턴스
 
Aws 인스턴스 세부 내용
 
Aws 내부 접속
 
Aws 내부에서 돌아가는 docker
 

Nginx
Nginx 정의 파일
-	Dokcer-entrypoint.sh
	#!/bin/bash
	
	# Destination of env file inside container
	ENV_FILE="/var/www/.env"
	
	# Loop through XDEBUG, PHP_IDE_CONFIG and REMOTE_HOST variables and check if they are set.
	# If they are not set then check if we have values for them in the env file, if the env file exists. If we have values
	# in the env file then add exports for these in in the ~./bashrc file.
	for VAR in XDEBUG PHP_IDE_CONFIG REMOTE_HOST
	do
	  if [ -z "${!VAR}" ] && [ -f "${ENV_FILE}" ]; then
	    VALUE=$(grep $VAR $ENV_FILE | cut -d '=' -f 2-)
	    if [ ! -z "${VALUE}" ]; then
	      # Before adding the export we clear the value, if set, to prevent duplication.
	      sed -i "/$VAR/d"  ~/.bashrc
	      echo "export $VAR=$VALUE" >> ~/.bashrc;
	    fi
	  fi
	done
	
	# If there is still no value for the REMOTE_HOST variable then we set it to the default of host.docker.internal. This
	# value will be sufficient for windows and mac environments.
	if [ -z "${REMOTE_HOST}" ]; then
	  REMOTE_HOST="host.docker.internal"
	  sed -i "/REMOTE_HOST/d"  ~/.bashrc
	  echo "export REMOTE_HOST=\"$REMOTE_HOST\"" >> ~/.bashrc;
	fi
	
	# Source the .bashrc file so that the exported variables are available.
	. ~/.bashrc
	
	# Start the cron service.
	service cron start
	
	# Toggle xdebug
	if [ "true" == "$XDEBUG" ] && [ ! -f /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini ]; then
	  # Remove PHP_IDE_CONFIG from cron file so we do not duplicate it when adding below
	  sed -i '/PHP_IDE_CONFIG/d' /etc/cron.d/laravel-scheduler
	  if [ ! -z "${PHP_IDE_CONFIG}" ]; then
	    # Add PHP_IDE_CONFIG to cron file. Cron by default does not load enviromental variables. The server name, set here, is
	    # used by PHPSTORM for path mappings
	    echo -e "PHP_IDE_CONFIG=\"$PHP_IDE_CONFIG\"\n$(cat /etc/cron.d/laravel-scheduler)" > /etc/cron.d/laravel-scheduler
	  fi
	  # Enable xdebug estension and set up the docker-php-ext-xdebug.ini file with the required xdebug settings
	  docker-php-ext-enable xdebug && \
	  echo "xdebug.remote_enable=1" >> /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini; \
	  echo "xdebug.remote_autostart=1" >> /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini; \
	  echo "xdebug.remote_connect_back=0" >> /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini; \
	  echo "xdebug.remote_host=$REMOTE_HOST" >> /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini;
	
	elif [ -f /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini ]; then
	  # Remove PHP_IDE_CONFIG from cron file if already added
	  sed -i '/PHP_IDE_CONFIG/d' /etc/cron.d/laravel-scheduler
	  # Remove Xdebug config file disabling xdebug
	  rm -rf /usr/local/etc/php/conf.d/docker-php-ext-xdebug.ini
	fi
	
	exec "$@"


-	dockerfile
	# Copied from cyberduck/php-fpm-laravel
	#https://github.com/Cyber-Duck/php-fpm-laravel/blob/8.1/Dockerfile
	FROM php:8.1-fpm
	
	MAINTAINER support@cyber-duck.co.uk
	
	ENV COMPOSER_MEMORY_LIMIT='-1'
	
	RUN apt-get update && \
	    apt-get install -y --force-yes --no-install-recommends \
	        libmemcached-dev \
	        libzip-dev \
	        libz-dev \
	        libzip-dev \
	        libpq-dev \
	        libjpeg-dev \
	        libpng-dev \
	        libfreetype6-dev \
	        libssl-dev \
	        openssh-server \
	        libmagickwand-dev \
	        git \
	        cron \
	        nano \
	        libxml2-dev \
	        libreadline-dev \
	        libgmp-dev \
	        mariadb-client \
	        unzip
	
	# Install soap extention
	RUN docker-php-ext-install soap
	
	# Install for image manipulation
	RUN docker-php-ext-install exif
	
	# Install the PHP pcntl extention
	RUN docker-php-ext-install pcntl
	
	# Install the PHP zip extention
	RUN docker-php-ext-install zip
	
	# Install the PHP pdo_mysql extention
	RUN docker-php-ext-install pdo_mysql
	
	# Install the PHP pdo_pgsql extention
	RUN docker-php-ext-install pdo_pgsql
	
	# Install the PHP bcmath extension
	RUN docker-php-ext-install bcmath
	
	# Install the PHP intl extention
	RUN docker-php-ext-install intl
	
	# Install the PHP gmp extention
	RUN docker-php-ext-install gmp
	
	#####################################
	# PHPRedis:
	#####################################
	RUN pecl install redis && docker-php-ext-enable redis
	
	#####################################
	# Imagick:
	#####################################
	
	RUN pecl install imagick && \
	    docker-php-ext-enable imagick
	
	#####################################
	# GD:
	#####################################
	
	# Install the PHP gd library
	RUN docker-php-ext-install gd && \
	    docker-php-ext-configure gd --with-freetype --with-jpeg && \
	    docker-php-ext-install gd
	
	#####################################
	# xDebug:
	#####################################
	
	# Install the xdebug extension
	RUN pecl install xdebug
	
	#####################################
	# PHP Memcached:
	#####################################
	
	# Install the php memcached extension
	RUN pecl install memcached && docker-php-ext-enable memcached
	
	#####################################
	# Composer:
	#####################################
	
	# Install composer and add its bin to the PATH.
	RUN curl -s http://getcomposer.org/installer | php && \
	    echo "export PATH=${PATH}:/var/www/vendor/bin" >> ~/.bashrc && \
	    mv composer.phar /usr/local/bin/composer
	# Source the bash
	RUN . ~/.bashrc
	
	#####################################
	# Laravel Schedule Cron Job:
	#####################################
	
	RUN echo "* * * * * www-data /usr/local/bin/php /var/www/artisan schedule:run >> /dev/null 2>&1"  >> /etc/cron.d/laravel-scheduler
	RUN chmod 0644 /etc/cron.d/laravel-scheduler
	
	#
	#--------------------------------------------------------------------------
	# Final Touch
	#--------------------------------------------------------------------------
	#
	
	ADD ./laravel.ini /usr/local/etc/php/conf.d
	
	#####################################
	# Aliases:
	#####################################
	# docker-compose exec php-fpm dep --> locally installed Deployer binaries
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/vendor/bin/dep "$@"' > /usr/bin/dep
	RUN chmod +x /usr/bin/dep
	# docker-compose exec php-fpm art --> php artisan
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/artisan "$@"' > /usr/bin/art
	RUN chmod +x /usr/bin/art
	# docker-compose exec php-fpm migrate --> php artisan migrate
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/artisan migrate "$@"' > /usr/bin/migrate
	RUN chmod +x /usr/bin/migrate
	# docker-compose exec php-fpm fresh --> php artisan migrate:fresh --seed
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/artisan migrate:fresh --seed' > /usr/bin/fresh
	RUN chmod +x /usr/bin/fresh
	# docker-compose exec php-fpm t --> run the tests for the project and generate testdox
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/artisan config:clear\n/var/www/vendor/bin/phpunit -d memory_limit=2G --stop-on-error --stop-on-failure --testdox-text=tests/report.txt "$@"' > /usr/bin/t
	RUN chmod +x /usr/bin/t
	# docker-compose exec php-fpm d --> run the Laravel Dusk browser tests for the project
	RUN echo '#!/bin/bash\n/usr/local/bin/php /var/www/artisan config:clear\n/bin/bash\n/usr/local/bin/php /var/www/artisan dusk -d memory_limit=2G --stop-on-error --stop-on-failure --testdox-text=tests/report-dusk.txt "$@"' > /usr/bin/d
	RUN chmod +x /usr/bin/d
	
	RUN rm -r /var/lib/apt/lists/*
	
	RUN usermod -u 1000 www-data
	
	WORKDIR /var/www
	
	COPY ./docker-entrypoint.sh /usr/local/bin/
	RUN chmod +x /usr/local/bin/docker-entrypoint.sh
	RUN ln -s /usr/local/bin/docker-entrypoint.sh /
	ENTRYPOINT ["docker-entrypoint.sh"]
	
	EXPOSE 9000
	CMD ["php-fpm"]

Docker 내부에서 실행되는 nginx
 

Postgresql
Database설정
'pgsql' => [
            'driver' => 'pgsql',
            'url' => env('DATABASE_URL'),
            'host' => env('DB_HOST', '127.0.0.1'),
            'port' => env('DB_PORT', '5432'),
            'database' => env('DB_DATABASE', 'capstone_pgsql'),
            'username' => env('DB_USERNAME', 'capstone_p'),
            'password' => env('DB_PASSWORD', 'capstone_p'),
            'timezone' => 'UTC', // Set the timezone to UTC
            'charset' => 'utf8',
            'prefix' => '',
            'prefix_indexes' => true,
            'search_path' => 'public',
            'sslmode' => 'prefer',
        ],

Docker에 pgsql 정의
postgres:
        image: postgres:15
        container_name: capstone_postgres
        restart: always
        volumes:
            # - sailpostgres:/var/lib/postgresql/data
            - 'sail-pgsql:/var/lib/postgresql/data'
            - './vendor/laravel/sail/database/pgsql/create-testing-database.sql:/docker-entrypoint-initdb.d/10-create-testing-database.sql'
        environment:
            TZ: Asia/Seoul
            # POSTGRES_USER: root
            POSTGRES_PASSWORD: capstone_pgsql
            POSTGRES_USER: capstone_pgsql
            POSTGRES_DB: capstone_pgsql

            # 외부 접속  허용
            POSTGRES_HOST_AUTH_METHOD: trust
        ports:
            - 5434:5432
        networks:
            - sail

Docker 내부에서 실행되는 pgsql
 

Model
목록
 ![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/00076bf5-60ef-4967-8b1f-04f47115a984)


모델 1개 예시)
<?php

namespace App\Models;

use Carbon\Carbon;
use Illuminate\Database\Eloquent\SoftDeletes;
use Jenssegers\Mongodb\Eloquent\HybridRelations;

use Illuminate\Support\Facades\Hash;

/**
 * public @method departments()
 */
class Board extends BaseModel
{
    use HybridRelations;
    use SoftDeletes;

    protected $connection = 'pgsql';
    protected $table = 'boards';

    protected $dates = [
        'deleted_at',
    ];

    protected $casts = [
    ];

    protected $fillable = [
        'club_id', 'user_id', 'menu_id', 'title', 'content', 'hits', 'position', 'image', 'block_comment', 'created_at', 'updated_at','deleted_at'
    ];

    protected $hidden = [
    ];

    public function __construct(array $attributes = array())
    {
        parent::__construct($attributes);

        # 클럽 아이디
        $this->club_id = isset($attributes['club_id']) ? $attributes['club_id'] : null;
        # 사용자 아이디
        $this->user_id = isset($attributes['user_id']) ? $attributes['user_id'] : null;
        # 메뉴 아이디
        $this->menu_id = isset($attributes['menu_id']) ? $attributes['menu_id'] : null;
        # 제목
        $this->title = isset($attributes['title']) ? $attributes['title'] : null;
        # 내용
        $this->content = isset($attributes['content']) ? $attributes['content'] : null;
        # 조회 수
        $this->hits = isset($attributes['hits']) ? $attributes['hits'] : 0;
        # 순서
        $this->position = isset($attributes['position']) ? $attributes['position'] : 0;

        # 이미지 여부
        $this->image = isset($attributes['image']) ? $attributes['image'] : false;
        # 댓글 금지 여부
        $this->block_comment = isset($attributes['image']) ? $attributes['image'] : false;

        // 삭제/추가/수정 시간
        $this->created_at = isset($attributes['created_at']) ? $attributes['created_at'] : Carbon::now();
        $this->updated_at = isset($attributes['updated_at']) ? $attributes['updated_at'] : Carbon::now();
        $this->deleted_at = isset($attributes['deleted_at']) ? $attributes['deleted_at'] : null;
    }
}


Migration
<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class () extends Migration {
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        # clubs table
        Schema::create('clubs', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('동아리 이름');
            $table->unsignedBigInteger('code')->nullable()->comment('동아리 코드');
            $table->unsignedBigInteger('position')->nullable()->comment('동아리 번호');
            $table->string('grade', 100)->nullable()->comment('동아리 권한');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('name');
            $table->unique('code');

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');
        });

        # club_emergency_contact_network table
        Schema::create('club_emergency_contact_network', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('동아리 비상연락망 번호');
            $table->unsignedBigInteger('club_id')->comment('동아리 번호');
            $table->string('email', 100)->nullable()->comment('비상 이메일');
            $table->json('phone')->nullable()->comment('비상 전화번호');
            $table->string('location', 100)->nullable()->comment('동아리 위치');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('club_id');

            # 인덱스
            $table->index('id');
            $table->index('club_id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

        # departments table
        Schema::create('departments', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('학과 번호');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('학과 이름');
            $table->string('code', 100)->nullable()->comment('학과 코드');
            $table->unsignedBigInteger('position')->nullable()->comment('학과 순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique('name');
            $table->unique('code');

            # 인덱스
            $table->index('id');
            $table->index('name');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

        # ranks table
        Schema::create('ranks', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('랭크 번호');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 100)->nullable()->comment('랭크 이름');
            $table->unsignedBigInteger('position')->nullable()->comment('랭크 순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

        Schema::create('teams', function (Blueprint $table) {
            $table->increments('id')->comment('팀 아이디');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
            $table->string('name', 50)->nullable()->comment('팀 이름');
            $table->string('path', 100)->nullable()->comment('상위팀 포함 팀 경로');
            $table->unsignedBigInteger('parent_id')->nullable();
            $table->unsignedBigInteger('position');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 인덱스
            $table->index('id');
            $table->index('club_id');
            $table->index('parent_id');
            $table->index('position');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('parent_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('set null');
        });

        # 클로저 테이블
        Schema::create('team_closure', function (Blueprint $table) {
            $table->bigIncrements('closure_id');
            $table->unsignedBigInteger('ancestor');
            $table->unsignedBigInteger('descendant');
            $table->unsignedInteger('depth');

            # 인덱스
            $table->index('ancestor');
            $table->index('descendant');

            # 키값
            $table->foreign('ancestor')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('descendant')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
        });

        // # teams table
        // Schema::create('teams', function (Blueprint $table) {
        //     # 칼럼
        //     $table->bigIncrements('id')->comment('팀 번호 ');
        //     $table->unsignedBigInteger('club_id')->nullable()->comment('동아리 번호');
        //     $table->unsignedBigInteger('parent_team_id')->nullable()->comment('상위 팀 번호');
        //     $table->string('name', 100)->nullable()->comment('팀 이름');
        //     $table->unsignedBigInteger('position')->nullable()->comment('팀 순서');
        //     $table->timestampsTz($precision = 3);
        //     $table->softDeletesTz($column = 'deleted_at', $precision = 3);

        //     # 유니크 값
        //     $table->unique('name');

        //     # 인덱스
        //     $table->index('id');
        //     $table->index('updated_at');
        //     $table->index('deleted_at');

        //     # 키값
        //     $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        // });

        # users table
        Schema::create('users', function (Blueprint $table) {
            # 칼럼
            $table->bigIncrements('id')->comment('사용자 번호');
            $table->unsignedBigInteger('club_id')->comment('동아리 번호');
            $table->unsignedBigInteger('department_id')->comment('학과 번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('직위번호');
            $table->unsignedBigInteger('student_id')->nullable()->comment('학생 번호');
            $table->string('name', 100)->nullable()->comment('성+이름');
            $table->string('gender', 100)->nullable()->comment('성별');
            $table->json('phone')->nullable()->comment('전화번호');
            $table->string('email', 100)->nullable()->comment('이메일 주소');
            $table->string('address', 200)->nullable()->comment('주소');
            $table->date('birth_date')->nullable()->comment('생년월일');
            $table->string('password')->nullable()->comment('비밀번호');
            $table->unsignedBigInteger('out_count')->nullable()->comment('경고 횟수');
            $table->unsignedBigInteger('password_fail_count')->nullable()->comment('비밀번호 틀린 횟수');
            $table->timestampTz('password_updated_at', $precision = 3)->nullable()->comment('비밀번호 변경 일시');
            $table->timestampTz('last_login_at', $precision = 3)->nullable()->comment('마지막 로그인 시간');
            $table->timestampTz('banned_at', $precision = 3)->nullable()->comment('접속제한 일시');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            # 유니크 값
            $table->unique(['club_id', 'student_id']);

            # 인덱스
            $table->index('id');
            $table->index('updated_at');
            $table->index('deleted_at');

            # 키값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('department_id')->references('id')->on('departments')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('cascade');
        });

        # members table
        Schema::create('members', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('department_id')->nullable()->comment('학과번호');
            $table->unsignedBigInteger('team_id')->nullable()->comment('팀번호');
            $table->unsignedBigInteger('user_id')->comment('동아리 회원 번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('직위번호');
            $table->unsignedSmallInteger('position')->comment('표시순서');
            $table->boolean('default')->default(false)->comment('사용자의 메인 팀 여부');
            $table->boolean('leader')->default(false)->comment('팀 리더 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['team_id', 'user_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('department_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('department_id')->references('id')->on('departments')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('team_id')->references('id')->on('teams')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('set null');
        });

        # rank_permissions table
        Schema::create('rank_permissions', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->nullable()->comment('동아리번호');
            $table->unsignedBigInteger('rank_id')->nullable()->comment('랭크번호');
            $table->boolean('board_access')->comment('게시판 권한');
            $table->boolean('comment_access')->comment('댓글 권한');
            $table->boolean('image_add_access')->comment('이미지 업로드 권한');
            $table->boolean('anonymous_comment_access')->comment('익명 댓글 권한');
            $table->boolean('community_add_access')->comment('커뮤니티 추가 권한');
            $table->boolean('user_ben_access')->comment('사용자 벤 권한');
            $table->boolean('admin_board_access')->comment('관리자 관련 게시판 탭 권한');
            $table->boolean('user_change_access')->comment('특정 사용자 변경 권한');
            $table->boolean('admin_access')->comment('어드민 권한');
            $table->unsignedSmallInteger('position')->comment('표시순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'rank_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('rank_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('rank_id')->references('id')->on('ranks')->onUpdate('cascade')->onDelete('cascade');
        });

        # access_tokens table
        Schema::create('jwt_token', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자아이디');
            $table->string('access_token', 500)->nullable()->comment('액세스토큰');
            $table->timestampTz('access_token_end_at')->nullable()->comment('액세스토큰 만료 일시');
            $table->string('refresh_token', 500)->nullable()->comment('재발급토큰');
            $table->timestampTz('refresh_token_end_at')->nullable()->comment('재발급토큰 만료 일시');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'user_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

        # user_login table
        Schema::create('user_login', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자아이디');
            $table->string('ip', 100)->nullable()->comment('접속 ip');
            $table->string('device', 100)->nullable()->comment('접속 기기');
            $table->string('etc', 100)->nullable()->comment('기타');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

        # project_consents table
        Schema::create('project_consents', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('랭크번호');
            $table->boolean('consent')->default(true)->comment('여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

        # cctv_consents table
        Schema::create('cctv_consents', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->boolean('consent')->default(true)->comment('동의여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        });

        // # announcement_boards table
        // Schema::create('announcement_boards', function (Blueprint $table) {
        //     $table->bigIncrements('id');
        //     $table->unsignedBigInteger('club_id')->comment('동아리번호');
        //     $table->unsignedBigInteger('user_id')->comment('사용자번호');
        //     $table->string('title', 100)->nullable()->comment('제목');
        //     $table->string('content', 2000)->nullable()->comment('내용');
        //     $table->unsignedBigInteger('hits')->comment('조회 수');
        //     $table->boolean('image')->default(false)->comment('이미지 여부');
        //     $table->boolean('block_comment')->default(false)->comment('댓글 금지 여부');
        //     $table->timestampsTz($precision = 3);
        //     $table->softDeletesTz($column = 'deleted_at', $precision = 3);

        //     // 인덱스
        //     $table->index('club_id');
        //     $table->index('user_id');
        //     $table->index('deleted_at');

        //     // 키 값
        //     $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        //     $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
        // });

        # menus table
        Schema::create('menus', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('type', 50)->nullable()->comment('메뉴 타입');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('type');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
        });

        # boards table
        Schema::create('boards', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('content', 2000)->nullable()->comment('내용');
            $table->unsignedBigInteger('hits')->comment('조회 수');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->boolean('image')->default(false)->comment('이미지 여부');
            $table->boolean('block_comment')->default(false)->comment('댓글 금지 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

        # bulletins table
        Schema::create('bulletins', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->string('title', 100)->nullable()->comment('제목');
            $table->string('content', 2000)->nullable()->comment('내용');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

        # common_moneys table
        Schema::create('common_moneys', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->unsignedBigInteger('money')->comment('돈');
            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 유니크
            $table->unique(['club_id', 'menu_id']);

            // 인덱스
            $table->index('club_id');
            $table->index('menu_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

        # image_boards table
        Schema::create('image_boards', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('menu_id')->comment('메뉴번호');
            $table->unsignedBigInteger('image_id')->nullable()->comment('이미지번호');

            $table->string('title', 100)->nullable()->comment('제목');
            $table->unsignedBigInteger('money')->nullable()->comment('지불');

            $table->unsignedBigInteger('position')->comment('순서');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('menu_id');
            $table->index('image_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('menu_id')->references('id')->on('menus')->onUpdate('cascade')->onDelete('cascade');
        });

        # comments table
        Schema::create('comments', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('club_id')->comment('동아리번호');
            $table->unsignedBigInteger('user_id')->comment('사용자번호');
            $table->unsignedBigInteger('board_id')->comment('게시판번호');
            $table->string('content', 300)->nullable()->comment('내용');
            $table->boolean('hidden_comment')->default(false)->comment('비밀 댓글 여부');
            $table->timestampsTz($precision = 3);
            $table->softDeletesTz($column = 'deleted_at', $precision = 3);

            // 인덱스
            $table->index('club_id');
            $table->index('user_id');
            $table->index('board_id');
            $table->index('deleted_at');

            // 키 값
            $table->foreign('club_id')->references('id')->on('clubs')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('user_id')->references('id')->on('users')->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('board_id')->references('id')->on('boards')->onUpdate('cascade')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        # 테이블 삭제

        # 토큰 관련 테이블
        Schema::dropIfExists('oauth_access_tokens');
        Schema::dropIfExists('oauth_auth_codes');
        Schema::dropIfExists('oauth_clients');
        Schema::dropIfExists('oauth_personal_access_clients');
        Schema::dropIfExists('oauth_refresh_tokens');
        # 실제 사용 테이블
        Schema::dropIfExists('comments');
        Schema::dropIfExists('image_boards');
        Schema::dropIfExists('bulletins');
        Schema::dropIfExists('boards');
        Schema::dropIfExists('common_moneys');
        Schema::dropIfExists('menus');
        Schema::dropIfExists('announcement_boards');
        Schema::dropIfExists('cctv_consents');
        Schema::dropIfExists('project_consents');
        Schema::dropIfExists('user_login');
        Schema::dropIfExists('jwt_token');
        Schema::dropIfExists('rank_permissions');
        Schema::dropIfExists('members');
        Schema::dropIfExists('users');
        Schema::dropIfExists('team_closure');
        Schema::dropIfExists('teams');
        Schema::dropIfExists('ranks');
        Schema::dropIfExists('departments');
        Schema::dropIfExists('club_emergency_contact_network');
        Schema::dropIfExists('clubs');
        Schema::dropIfExists('personal_access_tokens');
    }
};

<br>
Router<br>
![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/60b4d75d-69dd-4be6-b3fd-d58a953d054d)

 
Middleware
<?php

namespace App\Http\Middleware;

use Closure;
use Firebase\JWT\JWT;
use Illuminate\Http\Request;

use Carbon\Carbon;
use Illuminate\Support\Facades\Cache;
use Illuminate\Support\Facades\Storage;
use Illuminate\Support\Facades\Auth;

use App\Models\Club;
use App\Models\User;
use App\Models\JwtToken;

class JWTMiddleware
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure(\Illuminate\Http\Request): (\Illuminate\Http\Response|\Illuminate\Http\RedirectResponse)  $next
     * @return \Illuminate\Http\Response|\Illuminate\Http\RedirectResponse
     */
    public function handle(Request $request, Closure $next)
    {
        # 토큰 추출
        $authorizationHeader = $_SERVER['HTTP_AUTHORIZATION'];
        $token = str_replace('Bearer ', '', $authorizationHeader);

        $urlSegments = explode('/', $request->getPathInfo());
        $club_id = $urlSegments[3];
        $user_id = $urlSegments[5];

        # 토큰 조회
        $tokenInfo = JwtToken::where('access_token', $token)->first();
        if($tokenInfo === null) {
            abort(403, 'Token does not exist.');
        }

        # 본인 토큰인지 검사
        $userToken = JwtToken::where('club_id', $club_id)
                                                ->where('user_id', $user_id)
                                                ->where('access_token', $token)
                                                ->first();
        if($userToken === null) {
            abort(403, 'Another user token is in use.');
        }

        # 토큰 검사
        $access_token_test = JwtToken::jwtAccessCheckToken($tokenInfo->user_id);
        if($access_token_test === null) {
            abort(401, 'Token Expire');
        }

        #클럽 조회
        $club = Club::where('id', $tokenInfo->club_id)->first();
        if($club === null) {
            abort(403, 'The information in the token is a club that does not exist.');
        }

        # 사용자 조회
        $user = User::where('id', $tokenInfo->user_id)->first();
        if($user === null) {
            abort(403, 'The information contained in the token is a non-existent user.');
        }

        # request에 정보 담기
        $token_club_id = $tokenInfo->club_id;
        $token_user_id = $tokenInfo->user_id;
        $request->attributes->set('club_id', $token_club_id);
        $request->attributes->set('user_id', $token_user_id);
        return $next($request);
    }
}

<br>
Observer<br>
![image](https://github.com/seonghuncode/Capstone2-vesion.02-/assets/93322852/523417f8-2fbc-4f2e-bac2-20410493b3b4)

 
참고사항
프로젝트 내부 코드를 진짜 조금 넣었습니다.
로직이 돌아가는 코드는 하나도 넣지 않았으며 기본적으로 환경을 잡을 때 세팅하는 내용만 적고 필수적으로 사용했다는걸 증명하기 위한 코드는 넣었습니다.
 
Ⅴ. 과제 수행 후기
이번 졸업작품으로 웹 페이지를 개발하는 과정에서 여러 시행착오를 겪었습니다. 백엔드와 프론트엔드를 나누어 작업하면서 협업의 중요성을 실감하게 되었고, 그 중요성을 깊이 느낄 수 있었습니다. 협업을 통해 효율적인 개발과 의사소통을 할 수 있었고, 팀원들과의 협업을 통해 프로젝트를 성공적으로 마칠 수 있었습니다.

또한, 개발 과정에서 직접 기능을 구현하고 필요한 라이브러리를 찾아서 사용해보면서 많은 것을 배우고 느낄 수 있었습니다. 원하는 기능을 구현하는 과정에서 새로운 도구와 기술을 탐색하고 익히는 경험은 매우 유익했습니다. 특히, 실제 서버와의 통신을 통해 데이터를 주고받고 데이터베이스에 저장하는 과정을 경험하면서 웹 프로그램의 동작 원리를 이해하는 좋은 기회였습니다.

이번 프로젝트를 통해 팀워크와 커뮤니케이션의 중요성을 깨달았으며, 새로운 기술과 도구를 습득하는 능력을 향상시킬 수 있었습니다. 개발자로서 성장할 수 있는 좋은 경험이었고, 앞으로의 개발 프로젝트에도 보탬이 될 것 같습니다.

