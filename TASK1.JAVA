class LCSALGO {
public static void main(String[] args) {
char[] X = {&#39;P&#39;, &#39;A&#39;, &#39;R&#39;, &#39;K&#39;};
char[] Y = {&#39;S&#39;, &#39;P&#39;, &#39;A&#39;, &#39;K&#39;, &#39;E&#39;};
int[][] ans = (int[][]) LCSALG(X,Y);
System.out.println(ans);
}
// for i = 1 to m do
// for j = 1 to n do
// if xi = yj
// C[i, j] := C[i - 1, j - 1] + 1
// B[i, j] := D
static Object[] LCSALG(char[] X, char[] Y){
int m = X.length;
int n = Y.length;
int[][] c = new int[m][n];
int b[][] = new int[m][n];
for (int i = 1; i &lt; m; i++) {
c[i][0] = 0;
for (int j = 1; j &lt; n; j++) {
c[0][j] = 0;
}
}
for (int i = 1; i &lt; m; i++) {
for (int j = 1; j &lt; n; j++) {
if(X[i] == Y[j]){
c[i][j] = c[i-1][j-1] + 1;
b[i][j] = &#39;D&#39;;
}
else{
if (c[i-1][j] == c[i][j-1]){
c[i][j] = c[i-1][j] + 1;
b[i][j] = &#39;U&#39;;
}
else {
c[i][j] = c[i][j-1]+1;
b[i][j] = &#39;L&#39;;
}
}
}
}
return new Object[] {c, b};
}
}