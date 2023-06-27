for i in `ls -1 *.mp3`; do
  artist_title=`echo $i | sed -e 's/^[[:digit:]]\+\.//' -e 's/_/ /g' -e 's/-/ /g' -e 's/\.mp3//'`
  echo "$artist_title"
done
