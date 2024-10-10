main() {
    local N x res memo=()

    read N

    while true; do
        memo[x]=1
        res=$x
        x=$(( (x * 2 + 1) % N ))

        if (( x == 0 || memo[x] == 1 )); then
            break
        fi
    done

    echo $(( res + 1 ))
}

main