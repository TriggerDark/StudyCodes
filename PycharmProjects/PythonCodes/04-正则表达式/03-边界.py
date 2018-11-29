import re

print(re.split(r'\bdog\b', 'Justin dog Color doggie ii'))
print(re.match(r'^.+\bve\b', 'ho ve r').group())
print(re.match(r'^.+\Bve\B', 'hover').group())