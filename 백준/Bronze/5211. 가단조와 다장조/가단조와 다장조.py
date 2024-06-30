line = input().strip().split("|")

ade_minor = ['A', 'D', 'E']
cfg_major = ['C', 'F', 'G']

ade_minor_cnt = 0
cfg_major_cnt = 0

for i in line:
    if i[0] in ade_minor:
        ade_minor_cnt += 1
    if i[0] in cfg_major:
        cfg_major_cnt += 1

if ade_minor_cnt == cfg_major_cnt:
    if line[-1][-1] in cfg_major:
        cfg_major_cnt += 1
    if line[-1][-1] in ade_minor:
        ade_minor_cnt += 1

if ade_minor_cnt < cfg_major_cnt:
    print("C-major")
else:
    print("A-minor")
