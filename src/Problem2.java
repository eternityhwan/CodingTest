//import java.util.Arrays;
//
//public class Problem2 {
//
//

        // 니가 서브스트링 함수를 쓸 수 있느냐 떠올릴 수 있느냐 묻는 의도같다.
//        String su = "수박수박수박수박수박수?";
//
//        String nomu = su.substring(0,4);
//
//        System.out.printf("%s",nomu);
//
//    }
//}
        // 배열 형식을 변경해서는 못풂 substring으로 푸는 수 밖에 없다.
//
//        int c = 4;
//        char[] arr = new char[su.length()]; // 문자열 길이만큼 배열 생성성
//          이래하면 포문에 4를 입력한 꼴 밖에 되지 않음.
//        for (int i = 0; i < c; i++) {
//            arr[i] = su.charAt(i);
//        }
//        System.out.printf("%s",Arrays.toString(arr));
//    }
//}

        // 위 문자열을 내가 지정하는 수 만큼 출력하는 기능을 만든다.
        // 그렇다면 문자 n = 0.1.2.3.4. 이렇게 나열을 해야 매칭이 될 테니 배열을 사용해서
        // 위 문자를 배열로 만들고. 그 문자 한개 한개를 받아 출력하게 만든다.

        // 그런거 하지말고 문자열 지정후 printf 형식으로 4글자만 나오게 출력하면 간단한데.

        // 서브스트링(시작위치, 끝위치) 이렇게 써주면되는데 서브스트링으로 푸는 문제 아닌듯..
        //        System.out.println(su.substring(c));

        // printf로 푸는 문제도 아닌듯..
        // System.out.printf("%.4s%n", su); // %.4s%n  -- %.4s,  표시해야할문자열
                                         // %n 줄바꿈

        // 문자열 안쓰고 substring 사용하는게 낫겠는데.
        // 하지만 문제 요구 사항은 n값을 넣은 만큼 문자열을 자르기임.

//        String result = su.substring(0, 6);
//
//        System.out.println(result);
//    }

        // charAt 문자열중 한글자만 선택해서 char 타입으로 변환해줌.




