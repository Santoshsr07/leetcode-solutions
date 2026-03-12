// 2942. Find Words Containing Character

// You are given a 0-indexed array of strings words and a character x.
// Return an array of indices representing the words that contain the character x.
// Note that the returned array may be in any order.

// Example 1:

// Input: words = ["leet","code"], x = "e"
// Output: [0,1]
// Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

int *findWordsContaining(char **words, int wordsSize, char x, int *returnSize)
{
    int *result = (int *)malloc(wordsSize * sizeof(int));
    *returnSize = 0;
    for (int i = 0; i < wordsSize; i++)
    {
        for (int j = 0; words[i][j] != '\0'; j++)
        {
            if (words[i][j] == x)
            {
                result[(*returnSize)++] = i;
                break;
            }
        }
    }
    return result;
}