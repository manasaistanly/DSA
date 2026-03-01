#include <limits.h>

bool isPalindrome(int x) {
    int dup = x;
    int reverse = 0;
    int ld;
    while(x>0){
        int ld = x%10;
        if(reverse > INT_MAX/10)
            return false;
        
        reverse = reverse*10+ld;
        x=x/10;
    }
    if(reverse==dup){
        return true;
    }
    else{
        return false;
    }
}