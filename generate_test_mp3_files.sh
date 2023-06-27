iter=$1
for ((i=1; i<=iter; i++))
 do
  artistA=`</dev/urandom tr -dc 'A-Za-z0-9' | head -c 5`
  artistB=`</dev/urandom tr -dc 'A-Za-z0-9' | head -c 6`
  
  titleA=`</dev/urandom tr -dc 'A-Za-z0-9' | head -c 5`
  titleB=`</dev/urandom tr -dc 'A-Za-z0-9' | head -c 4`
  #sha512=`echo $str | sha512sum | sed -e 's/\s*-//g'`

  touch "$i.${artistA}_${artistB}-${titleA}_${titleB}.mp3"
done
