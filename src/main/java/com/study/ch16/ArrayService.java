package com.study.ch16;

import com.study.ch09.Computer;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) {
        String[] newArray = new String[strArray.length + 1]; // 기존 배열의 크기 +1
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
        strArray[strArray.length - 1] = str; // 배열 끝에 넣는다.
    }

    public void remove(int index) {
        String[] newArray = new String[strArray.length - 1]; // index 번호 삭제할 거니 -1
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = strArray[i < index ? i : i + 1];  // index보다 작으면 그대로 사용 i+1을 i 자리로 이동
        }
        strArray = newArray;
    }

    public String get(int index) {

        return strArray[index];
    }

    public int indexOf(String str) {
        if(str == null) {
            return -1;
        }
        for(int i = 0; i <strArray.length; i++){
            if(strArray[i].equals(str)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if (i < strArray.length - 1) {
                result += ", ";
            }

        }
        return result += " ]";
    }

}




