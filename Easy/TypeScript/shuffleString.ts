function restoreString(s: string, indices: number[]): string {
  const letters: string[] = s.split("");
  const shuffledString: string[] = new Array(indices.length);

  indices.forEach((index, counter) => {
    shuffledString[index] = letters[counter];
  });

  return shuffledString.join("");
}
